# Design decisions
## [scala-js-dom](https://scala-js.github.io/scala-js-dom/)
It would be very handy if we could reuse `scala-js-dom` dom facade library.
However in order to make the following code runnable on the JVM

```
val d = div()
d.onclick = (e: MouseEvent) => {}
```

we would need to subclass all facade types from `scala-js-dom` library
with some stub implementation.
But the typical facade type in that library looks like this

```
@js.native
abstract class HTMLElement extends Element {
...
var onclick: js.Function1[MouseEvent, _] = js.native
...
```
Which makes it impossible to subclass since all those `js.native` calls
throw exceptions in constructors.

An attempt has been made to separate rendering and handler attaching,
so that latter can be skipped on the server.

## Conditional attributes
A special object `NoAttr` was introduced for conditional attributes support.
The approach with `Option[Attr]` didn't look nice
```
class DslWord {
  def apply(a1: Option[Attr], a2: Option[Attr])
}

trait AttrKeys {
  val disabled = Some(Attr("disabled"))
}
```

## DSL
This approach forces us to use parentheses, even when there are no attributes
```
def div(attrs: Attr*)(body: => Unit) = ???

div() {
    ....
}
```
This approach forces us to specify body even for leaf nodes
```
def div(attrs: Attr*)(body: => Unit) = ???
def div(body: => Unit) = ???

div(id := "main"){}
```
This approach has an unusual syntax
```
def div(a1: Attr, body: => Unit) = ???
def div(a1: Attr) = ???

div(id := "main", {
    ...
})
```

### fad

The best approach we could find is to make the `apply(body: => Unit)` method
available on an `Element` through an implicit conversion.

```
def div: HTMLDivElement = ???
def div(body: => Any): HTMLDivElement = ???
def div(attrs: Attr*): HTMLDivElement = ???
implicit def elementToAppliable[T <: Element](element: Element) = new {
  def apply(body: => Unit) = ???
}
```

That makes best possible DSL

```
div

div()

div(id := "main")

div {
}

div() {
}

div(id := "main") {
}

div {
  div
}

div() {
  div
}

div(id := "main") {
  div
}
```

The drawback is that we don't know when to finish element construction,
cause at the moment of `div()` call we are not sure if there is a body.
That's not a problem for the dom backend, cause there is no need to finish elements,
but there is such a need for the incremental dom backend.
We could store current element somewhere and in the beginning
of next element construction finish it, but there is no next element for a top level node.
The solution could be surrounding dsl calls with some another call,
that finishes the construction of the top level node.

Also we won't be able to pass a backend implicitly, cause the following will fail

```
div(id := "main") {
  div
}
```

with the type mismatch error: expected `Backend` actual `HTMLDivElement`.