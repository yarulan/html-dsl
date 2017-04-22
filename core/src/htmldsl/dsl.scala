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

class DslWord[T <: Element](tagName: String, backend: DslBackend) {
  def apply(attrs: Attr*)(createChildNodes: => Unit): T = {
    val element = backend.beginElement[T](tagName, attrs)
    if (element != null) {
      backend.getElementUnderConstruction.foreach(_.appendChild(element))
    }
    val tmp = backend.getElementUnderConstruction
    if (element != null) {
      backend.setElementUnderConstruction(Some(element))
    }
    createChildNodes
    backend.endElement(tagName)
    backend.setElementUnderConstruction(tmp)
    element
  }

  def apply(createChildNodes: => Unit): T = apply()(createChildNodes)
}

class Dsl(backend: DslBackend) extends AttrKeys {
  val div = new DslWord[HTMLDivElement]("div", backend)
  val form = new DslWord[HTMLFormElement]("form", backend)
  val label = new DslWord[HTMLLabelElement]("label", backend)
  val input = new DslWord[HTMLInputElement]("input", backend)
  val span = new DslWord[HTMLSpanElement]("span", backend)

  def text(value: String): Text = {
    backend.createTextNode(value)
  }
}