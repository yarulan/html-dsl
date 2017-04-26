package htmldsl.dom

import scala.scalajs.js

@js.native
trait NonDocumentTypeChildNode extends js.Object {
  def previousElementSibling: Element

  def nextElementSibling: Element
}