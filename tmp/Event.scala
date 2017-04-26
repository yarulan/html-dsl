package htmldsl.dom

import scala.scalajs.js

@js.native
trait Event extends js.Object {
  def timeStamp: Double

  def defaultPrevented: Boolean

  def isTrusted: Boolean

  def currentTarget: EventTarget

  def cancelBubble: Boolean

  def target: EventTarget

  def eventPhase: Int

  def cancelable: Boolean

  def `type`: String

  @deprecated("Non standard.", "forever")
  def srcElement: Element = js.native

  def bubbles: Boolean

  @deprecated("Non-standard", "forever")
  def initEvent(eventTypeArg: String, canBubbleArg: Boolean, cancelableArg: Boolean): Unit

  def stopPropagation(): Unit

  def stopImmediatePropagation(): Unit

  def preventDefault(): Unit
}