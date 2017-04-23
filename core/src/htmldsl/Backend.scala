package htmldsl

import org.scalajs.dom.raw.{Element, Text}

trait Backend {
  private var elementUnderConstruction: Option[Element] = None

  def setElementUnderConstruction(element: Option[Element]): Unit = {
    elementUnderConstruction = element
  }

  def getElementUnderConstruction: Option[Element] = elementUnderConstruction

  def beginElement[T <: Element](tagName: String, attrs: Seq[Attr]): T
  def endElement(tagName: String): Unit

  def createTextNode(data: String): Text
}
