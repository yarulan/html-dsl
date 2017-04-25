package htmldsl.dom

import org.scalajs.dom.raw._
import org.scalajs.dom.document
import htmldsl.{Attr, Backend}

object DomBackend extends Backend {
  private var elementUnderConstruction: Option[Element] = None
  override def setElementUnderConstruction(element: Option[Element]): Unit = {
    elementUnderConstruction = element
  }

  override def getElementUnderConstruction: Option[Element] = elementUnderConstruction

  override def beginElement[T <: Element](tagName: String, attrs: Seq[Attr]): T = {
    val element = document.createElement(tagName).asInstanceOf[T]
    attrs.foreach(attr => element.setAttribute(attr.name, attr.value.getOrElse("")))
    element
  }


  override def endElement(tagName: String): Unit = {
    // do nothing
  }

  override def createTextNode(data: String): Text = document.createTextNode(data)
}