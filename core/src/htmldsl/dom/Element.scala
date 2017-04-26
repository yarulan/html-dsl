package htmldsl.dom

import scala.scalajs.js

@js.native
trait Element extends Node with NodeSelector with ParentNode with NonDocumentTypeChildNode {
  def setAttribute(name: String, value: String): Unit
  def tagName: String
  var innerHTML: String
}