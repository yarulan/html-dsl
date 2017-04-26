package htmldsl.dom

import scala.scalajs.js

@js.native
trait EventTarget extends js.Object {
  def removeEventListener[T <: Event](`type`: String, listener: js.Function1[T, _], useCapture: Boolean): Unit

  def addEventListener[T <: Event](`type`: String, listener: js.Function1[T, _], useCapture: Boolean): Unit

  def dispatchEvent(evt: Event): Boolean
}