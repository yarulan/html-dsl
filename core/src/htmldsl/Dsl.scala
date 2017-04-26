package htmldsl

import htmldsl.dom._

import scala.language.implicitConversions

object Dsl extends Dsl

trait Dsl extends Object
  with HtmlTags
  with AttrKeys
  with Implicits
{
  def tag(name: String, attrs: Seq[Attr], body: => Unit)(implicit backend: Backend): Element = {
    val element = backend.beginElement[Element](name, attrs)
    if (element != null) {
      backend.getElementUnderConstruction.foreach(_.appendChild(element))
    }
    val tmp = backend.getElementUnderConstruction
    if (element != null) {
      backend.setElementUnderConstruction(Some(element))
    }
    body
    backend.endElement(name)
    backend.setElementUnderConstruction(tmp)
    element
  }

  def tag(name: String, attrs: Seq[Attr])(implicit backend: Backend): Element = {
    tag(name, attrs, {})
  }

  def text(value: String): Text = {
    val backend = Backend.current
    val node = backend.createTextNode(value)
    backend.getElementUnderConstruction.foreach(_.appendChild(node))
    node
  }
}