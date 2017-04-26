package htmldsl.backends.`object`

import htmldsl.backends.`object`.dom.{ElementImpl, HTMLElementImpl, HTMLInputElementImpl, TextImpl}
import htmldsl.{Attr, Backend, NoAttr, NoValueAttr, ValuedAttr}
import htmldsl.dom.{Element, Text}

object ObjectBackend extends Backend {
  override def beginElement[T <: Element](tagName: String, attrs: Seq[Attr]): T = {
    val element = tagName match {
      case "input" =>
        new HTMLInputElementImpl
      case whatever =>
        val s = tagName
        new HTMLElementImpl {
          override def tagName: String = s
        }
    }

    attrs.foreach {
      case NoAttr =>
        // Do nothing
      case ValuedAttr(name, value) =>
        element.setAttribute(name, value)
      case NoValueAttr(name) =>
        element.setAttribute(name, "")
    }
    element.asInstanceOf[T]
  }

  override def endElement(tagName: String): Unit = {
    // Do nothing
  }

  override def createTextNode(data: String): Text = new TextImpl(data)
}