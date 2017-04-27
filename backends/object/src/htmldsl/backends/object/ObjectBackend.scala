package htmldsl.backends.`object`

import htmldsl.{Attr, Backend, NoAttr, NoValueAttr, ValuedAttr}
import org.scalajs.dom.raw._

object ObjectBackend extends Backend {
  override def beginElement[T <: Element](tagName: String, attrs: Seq[Attr]): T = {
    val element = tagName match {
      case "head" => new HTMLHeadElement
      case "meta" => new HTMLMetaElement
      case "title" => new HTMLTitleElement
      case "link" => new HTMLLinkElement
      case "script" => new HTMLScriptElement
      case "body" => new HTMLBodyElement
      case "h1" => new HTMLHeadingElement
      case "div" => new HTMLDivElement
      case "span" => new HTMLSpanElement
      case "p" => new HTMLParagraphElement
      case "a" => new HTMLAnchorElement
      case "ul" => new HTMLUListElement
      case "li" => new HTMLLIElement
      case "form" => new HTMLFormElement
      case "label" => new HTMLLabelElement
      case "input" => new HTMLInputElement
      case "button" => new HTMLButtonElement
      case _ =>
        new HTMLElement(tagName)
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

  override def createTextNode(data: String): Text = new Text(data)
}