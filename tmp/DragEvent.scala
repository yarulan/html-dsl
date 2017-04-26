package htmldsl.dom

import scala.scalajs.js

@js.native
trait DragEvent extends MouseEvent {
  def dataTransfer: DataTransfer

  @deprecated("Non-standard", "forever")
  def initDragEvent(typeArg: String, canBubbleArg: Boolean,
    cancelableArg: Boolean, viewArg: Window, detailArg: Int, screenXArg: Int,
    screenYArg: Int, clientXArg: Int, clientYArg: Int, ctrlKeyArg: Boolean,
    altKeyArg: Boolean, shiftKeyArg: Boolean, metaKeyArg: Boolean,
    buttonArg: Int, relatedTargetArg: EventTarget,
    dataTransferArg: DataTransfer): Unit
}