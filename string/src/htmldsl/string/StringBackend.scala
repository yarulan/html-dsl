package htmldsl.string

import htmldsl.{Attr, Backend}
import org.scalajs.dom.raw._
import org.owasp.encoder.Encode

class StringBackend extends Backend {
  val builder = new StringBuilder

  override def beginElement[T <: Element](tagName: String, attrs: Seq[Attr]): T = {
    builder.append(s"<$tagName")
    attrs.foreach { attr =>
      attr.value match {
        case Some(value) =>
          builder.append(s""" ${attr.name}="${Encode.forHtmlAttribute(value)}"""")
        case None =>
          builder.append(s""" ${attr.name}""")
      }
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