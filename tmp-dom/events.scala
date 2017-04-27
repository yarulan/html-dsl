package htmldsl.dom

import scala.scalajs.js

@js.native
trait Event extends js.Object {
  def preventDefault(): Unit
}

@js.native
trait UIEvent extends Event

@js.native
trait ModifierKeyEvent extends js.Object

@js.native
trait KeyboardEvent extends UIEvent with ModifierKeyEvent {
  def keyCode: Int
}