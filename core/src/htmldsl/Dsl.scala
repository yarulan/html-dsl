package htmldsl

import org.scalajs.dom.raw._

import scala.language.implicitConversions

object Dsl extends Dsl

trait Dsl extends Object
  with Tags
  with AttrKeys
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

  def text(value: String)(implicit backend: Backend): Text = {
    val node = backend.createTextNode(value)
    backend.getElementUnderConstruction.foreach(_.appendChild(node))
    node
  }

  implicit def stringToAttrKey(attrName: String): AttrKey = AttrKey(attrName)
  implicit def symbolToAttrKey(symbol: Symbol): AttrKey = AttrKey(symbol.name)
  implicit def stringToDslWord(tagName: String): DslWord[Element] = new DslWord[Element](tagName)
  implicit def symbolToDslWord(tagName: Symbol): DslWord[Element] = new DslWord[Element](tagName.name)


}