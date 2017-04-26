package htmldsl.dom

import scala.scalajs.js

@js.native
trait DOMList[T] extends js.Object {
  def length: Int

  def item(index: Int): T

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: Int): T

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: Int, v: T): Unit
}