package htmldsl

import org.scalajs.dom.raw.Element

case class Holder[T <: Element](element: T) extends AnyVal {
  def apply(body: => Unit): T = {
    val backend = Backend.current
    val tmp = backend.getElementUnderConstruction
    backend.setElementUnderConstruction(backend.lastConstructedNode)
    body
    backend.setElementUnderConstruction(tmp)
    element
  }
}