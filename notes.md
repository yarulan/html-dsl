# Design decisions
## [scala-js-dom](https://scala-js.github.io/scala-js-dom/)
It would be very handy if we could reuse `scala-js-dom` dom facade library.
However in order to make following code runnable on the JVM

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