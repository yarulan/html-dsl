package htmldsl

import htmldsl.html._

case class Attr(name: String, value: String)

case class AttrKey(name: String) {
  def :=(value: String): Attr = Attr(name, value)
}

trait AttrKeys {
  val `class` = AttrKey("class")
  val `for` = AttrKey("for")
  val `type` = AttrKey("type")
  val id = AttrKey("id")
  val placeholder = AttrKey("placeholder")
}

trait DslBackend {
  private var elementUnderConstruction: Option[Element] = None

  def setElementUnderConstruction(element: Option[Element]): Unit = {
    elementUnderConstruction = element
  }

  def getElementUnderConstruction: Option[Element] = elementUnderConstruction

  def beginElement[T <: Element](tagName: String, attrs: Seq[Attr]): T
  def endElement(tagName: String): Unit

  def createTextNode(data: String): Text
}

class DslWord[T <: Element](tagName: String) {
  def apply(attrs: Attr*)(createChildNodes: => Unit)(implicit backend: DslBackend): T = {
    Dsl.tag(tagName, attrs: _*)(createChildNodes).asInstanceOf[T]
  }

  def apply(createChildNodes: => Unit)(implicit backend: DslBackend): T = apply()(createChildNodes)
}

object Dsl extends Dsl

trait Dsl extends AttrKeys {
  def tag(name: String, attrs: Attr*)(createChildNodes: => Unit)(implicit backend: DslBackend): Element = {
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

  val div = new DslWord[HTMLDivElement]("div")
  val form = new DslWord[HTMLFormElement]("form")
  val label = new DslWord[HTMLLabelElement]("label")
  val input = new DslWord[HTMLInputElement]("input")
  val span = new DslWord[HTMLSpanElement]("span")

  def text(value: String)(implicit backend: DslBackend): Text = {
    backend.createTextNode(value)
  }

  implicit def stringToAttrKey(s: String): AttrKey = AttrKey(s)
}