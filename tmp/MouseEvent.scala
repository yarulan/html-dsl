package htmldsl.dom

import scala.scalajs.js

@js.native
trait MouseEvent extends UIEvent with ModifierKeyEvent {
  def screenX: Double

  def pageX: Double

  def pageY: Double

  def clientY: Double

  def screenY: Double

  def relatedTarget: EventTarget

  def button: Int

  def buttons: Int

  def clientX: Double

  @deprecated("Non-standard", "forever")
  def initMouseEvent(typeArg: String, canBubbleArg: Boolean,
    cancelableArg: Boolean, viewArg: Window, detailArg: Int, screenXArg: Int,
    screenYArg: Int, clientXArg: Int, clientYArg: Int, ctrlKeyArg: Boolean,
    altKeyArg: Boolean, shiftKeyArg: Boolean, metaKeyArg: Boolean,
    buttonArg: Int, relatedTargetArg: EventTarget): Unit

  def getModifierState(keyArg: String): Boolean
}