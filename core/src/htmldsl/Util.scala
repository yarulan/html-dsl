package htmldsl

import htmldsl.dom.Element

private object Util {
  def escapeHtml(html: String): String = {
    if (!html.exists({
      case '&' => true
      case '<' => true
      case '>' => true
      case '"' => true
      case '\'' => true
      case '/' => true
      case '`' => true
      case '=' => true
      case _ => false
    })) {
      html
    } else {
      html.map({
        case '&' => "&"
        case '<' => "<"
        case '>' => ">"
        case '"' => "\""
        case '\'' => "'"
        case '/' => "/"
        case '`' => "`"
        case '=' => "="
        case c => c.toString
      }).mkString
    }
  }

  def buildElement[T <: Element](tagName: String, attrs: Seq[Attr], body: => Unit): T = {
    val backend = Backend.current
    val element = backend.beginElement[Element](tagName, attrs)
    backend.getElementUnderConstruction.foreach(_.appendChild(element))
    val tmp = backend.getElementUnderConstruction
    backend.setElementUnderConstruction(Some(element))
    body
    backend.setElementUnderConstruction(tmp)
    backend.lastConstructedNode = Some(element)
    element.asInstanceOf[T]
  }
}