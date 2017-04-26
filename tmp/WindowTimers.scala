package htmldsl.dom

import scala.scalajs.js

@js.native
trait WindowTimers extends WindowTimersExtension {
  def clearTimeout(handle: Int): Unit

  def setTimeout(handler: js.Function0[Any], timeout: Double): Int

  def clearInterval(handle: Int): Unit

  def setInterval(handler: js.Function0[Any], timeout: Double): Int
}