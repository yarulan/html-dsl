package htmldsl.string

import htmldsl.{Attr, Backend, NoAttr, NoValueAttr, ValuedAttr}
import org.owasp.encoder.Encode
import htmldsl.dom._

class StringBackend extends Backend {
  val builder = new StringBuilder

  override def beginElement[T <: Element](tagName: String, attrs: Seq[Attr]): T = {
    builder.append(s"<$tagName")
    attrs.foreach {
      case NoAttr =>
        // Do nothing
      case ValuedAttr(name, value) =>
        builder.append(s""" $name="${Encode.forHtmlAttribute(value)}"""")
      case NoValueAttr(name) =>
        builder.append(s""" $name""")
    }
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