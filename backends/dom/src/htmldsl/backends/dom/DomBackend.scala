package htmldsl.backends.dom

import htmldsl.dom._
import htmldsl.{Attr, Backend, NoAttr, NoValueAttr, ValuedAttr}

object DomBackend extends Backend {
  private var elementUnderConstruction: Option[Element] = None
  override def setElementUnderConstruction(element: Option[Element]): Unit = {
    elementUnderConstruction = element
  }

  override def getElementUnderConstruction: Option[Element] = elementUnderConstruction

  override def beginElement[T <: Element](tagName: String, attrs: Seq[Attr]): T = {
    val element = htmldsl.dom.window.document.createElement(tagName).asInstanceOf[T]
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

  override def createTextNode(data: String): Text = window.document.createTextNode(data)
}