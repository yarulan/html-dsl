package htmldsl.dom

import scala.scalajs.js

@js.native
trait StyleSheetList extends js.Object {
  def length: Int

  def item(index: Int): StyleSheet

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: Int): StyleSheet

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: Int, v: StyleSheet): Unit
}