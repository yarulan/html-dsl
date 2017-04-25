package htmldsl.dom

import org.scalajs.dom.raw.{Element, Text}
import org.scalajs.dom.document
import htmldsl.{Attr, Backend, NoAttr, NoValueAttr, ValuedAttr}

object DomBackend extends Backend {
  private var elementUnderConstruction: Option[Element] = None
  override def setElementUnderConstruction(element: Option[Element]): Unit = {
    elementUnderConstruction = element
  }

  override def getElementUnderConstruction: Option[Element] = elementUnderConstruction

  override def beginElement[T <: Element](tagName: String, attrs: Seq[Attr]): T = {
    val element = document.createElement(tagName).asInstanceOf[T]
    attrs.foreach {
      case NoAttr =>
      // Do nothing
      case ValuedAttr(name, value) =>
        element.setAttribute(name, value)
      case NoValueAttr(name) =>
        element.setAttribute(name, "")
    }
    element
  }

  override def endElement(tagName: String): Unit = {
    // do nothing
  }

  override def createTextNode(data: String): Text = document.createTextNode(data)
}