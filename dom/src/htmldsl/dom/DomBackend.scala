package htmldsl.dom

import org.scalajs.dom.raw._
import htmldsl.{Attr, Backend}

object DomBackend extends Backend {
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
