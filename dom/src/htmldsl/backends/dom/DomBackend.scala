package htmldsl.backends.dom

import htmldsl.{Attr, DslBackend}
import htmldsl.html.{Element, Text}

object DomBackend extends DslBackend {
  private var elementUnderConstruction: Option[Element] = None
  override def setElementUnderConstruction(element: Option[Element]): Unit = {
    elementUnderConstruction = element
  }

  override def getElementUnderConstruction: Option[Element] = elementUnderConstruction

  override def beginElement[T <: Element](tagName: String, attrs: Seq[Attr]): T = {
    ???
  }


  override def endElement(tagName: String): Unit = ???

  override def createTextNode(data: String): Text = ???
}
