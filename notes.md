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