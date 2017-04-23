package htmldsl

import org.scalajs.dom.raw._

import scala.language.implicitConversions

class DslWord[T <: Element](tagName: String) {
  def apply(attrs: Attr*)(createChildNodes: => Unit)(implicit backend: Backend): T = {
    Dsl.tag(tagName, attrs: _*)(createChildNodes).asInstanceOf[T]
  }

  def apply(createChildNodes: => Unit)(implicit backend: Backend): T = apply()(createChildNodes)
}

object Dsl extends Dsl

trait Dsl extends Object
  with Tags
  with AttrKeys
{
  def tag(name: String, attrs: Attr*)(createChildNodes: => Unit)(implicit backend: Backend): Element = {
    val element = backend.beginElement[Element](name, attrs)
    if (element != null) {
      backend.getElementUnderConstruction.foreach(_.appendChild(element))
    }
    val tmp = backend.getElementUnderConstruction
    if (element != null) {
      backend.setElementUnderConstruction(Some(element))
    }
    createChildNodes
    backend.endElement(name)
    backend.setElementUnderConstruction(tmp)
    element
  }

  def text(value: String)(implicit backend: Backend): Text = {
    val node = backend.createTextNode(value)
    backend.getElementUnderConstruction.foreach(_.appendChild(node))
    node
  }

  implicit def stringToAttrKey(attrName: String): AttrKey = AttrKey(attrName)
  implicit def stringToDslWord(tagName: String): DslWord[Element] = new DslWord[Element](tagName)
  implicit def symbolToDslWord(tagName: Symbol): DslWord[Element] = new DslWord[Element](tagName.name)
}