package htmldsl.dom

import scala.scalajs.js

@js.native
trait Document extends js.Object {
  def createElement(tagName: String): Element
  def createTextNode(data: String): Text
}