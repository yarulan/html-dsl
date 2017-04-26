package htmldsl.dom

import scala.scalajs.js

@js.native
trait UIEvent extends Event {
  def detail: Int = js.native

  def view: Window = js.native

  def initUIEvent(typeArg: String, canBubbleArg: Boolean,
    cancelableArg: Boolean, viewArg: Window,
    detailArg: Int): Unit = js.native
}