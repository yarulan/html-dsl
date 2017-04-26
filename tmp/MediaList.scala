package htmldsl.dom

import scala.scalajs.js

@js.native
trait MediaList extends js.Object {
  def length: Int

  def mediaText: String

  def deleteMedium(oldMedium: String): Unit

  def appendMedium(newMedium: String): Unit

  def item(index: Int): String

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: Int): String

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: Int, v: String): Unit
}