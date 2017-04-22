package htmldsl.string

import htmldsl.{Attr, DslBackend}
import htmldsl.html.{Element, Text}
import org.owasp.encoder.Encode

class StringBackend extends DslBackend {
  val builder = new StringBuilder

  override def beginElement[T <: Element](tagName: String, attrs: Seq[Attr]): T = {
    builder.append(s"<$tagName")
    attrs.foreach { attr => builder.append(s""" ${attr.name}="${Encode.forHtmlAttribute(attr.value)}"""") }
    builder.append(">")
    null.asInstanceOf[T]
  }


  override def endElement(tagName: String): Unit = {
    builder.append(s"</$tagName>")
  }

  override def createTextNode(data: String): Text = {
    builder.append(Encode.forHtml(data))
    null.asInstanceOf[Text]
  }
}