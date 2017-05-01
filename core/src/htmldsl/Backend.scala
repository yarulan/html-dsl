package htmldsl

import org.scalajs.dom.raw.{Element, Text}

object Backend {
  private val backend = new ThreadLocal[Backend]

  def current: Backend = {
    val result = backend.get()
    if (result eq null) {
      throw new Exception("No backend available, make sure you called Backend.enable()")
    }
    result
  }

  private[htmldsl] def current_=(backend: Backend): Unit = this.backend.set(backend)
}

trait Backend {
  private var elementUnderConstruction: Option[Element] = None
  var lastConstructedNode: Option[Element] = None

  def setElementUnderConstruction(element: Option[Element]): Unit = {
    elementUnderConstruction = element
  }

  def getElementUnderConstruction: Option[Element] = elementUnderConstruction

  def beginElement[T <: Element](tagName: String, attrs: Seq[Attr]): T
  def endElement(tagName: String): Unit

  def createTextNode(data: String): Text

  def enable(): Unit = {
    Backend.current = this
  }
}