package htmldsl.dom

import scala.scalajs.js

@js.native
trait Attr extends Node {
  def specified: Boolean

  def ownerElement: Element

  var value: String

  def name: String

  override def prefix: String
}