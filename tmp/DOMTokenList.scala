package htmldsl.dom

import scala.scalajs.js

@js.native
trait DOMTokenList extends DOMList[String] {
  def contains(token: String): Boolean

  def remove(token: String): Unit

  def toggle(token: String): Boolean

  def toggle(token: String, force: Boolean): Boolean

  def add(token: String): Unit
}