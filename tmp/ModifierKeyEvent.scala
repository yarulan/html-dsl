package htmldsl.dom

import scala.scalajs.js

@js.native
trait ModifierKeyEvent extends js.Object {
  def metaKey: Boolean

  def altKey: Boolean

  def ctrlKey: Boolean

  def shiftKey: Boolean
}