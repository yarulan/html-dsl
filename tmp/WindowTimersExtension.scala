package htmldsl.dom

import scala.scalajs.js

@js.native
trait WindowTimersExtension extends js.Object {
  @deprecated("Non standard.", "forever")
  def clearImmediate(handle: Int): Unit

  @deprecated("Non standard.", "forever")
  def setImmediate(handler: js.Function0[Any]): Int
}