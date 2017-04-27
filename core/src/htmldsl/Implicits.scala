package htmldsl

import org.scalajs.dom.raw.{Element, Node, Text}

import scala.language.implicitConversions

trait Implicits {
  implicit def stringToAttrKey(attrName: String): AttrKey = AttrKey(attrName)

  implicit def symbolToAttrKey(symbol: Symbol): AttrKey = AttrKey(symbol.name)

  implicit def stringToDslWord(tagName: String): DslWord[Element] = new DslWord[Element](tagName)

  implicit def symbolToDslWord(tagName: Symbol): DslWord[Element] = new DslWord[Element](tagName.name)

  implicit def elementToAppliable[T <: Element](element: T): AppliableNodeWrapper[T] = {
    new AppliableNodeWrapper(element)
  }

  implicit def nodeToRenderable(node: Node): RenderableNodeWrapper = new RenderableNodeWrapper(node)

  implicit def holderToElement[T <: Element](holder: Holder[T]): T = holder.element
}

class AppliableNodeWrapper[T <: Element](val node: T) extends AnyVal {
  def apply(body: => Unit): T = {
    val backend = Backend.current
    val tmp = backend.getElementUnderConstruction
    backend.setElementUnderConstruction(backend.lastConstructedNode)
    body
    backend.setElementUnderConstruction(tmp)
    node
  }
}

class RenderableNodeWrapper(val node: Node) extends AnyVal {
  def toHtmlString: String = {
    def f(node: Node, builder: StringBuilder = new StringBuilder): StringBuilder = {
      node.nodeType match {
        case 3 =>
          val text = node.asInstanceOf[Text]
          builder.append(Util.escapeHtml(text.data))
          builder
        case 1 =>
          val element = node.asInstanceOf[Element]
          val encodedTagName = Util.escapeHtml(element.tagName)
          builder.append(s"<$encodedTagName")
          val attrs = element.attributes
          var i = 0
          while (i < attrs.length) {
            val attr = attrs.item(i)
            val encodedAttrName = Util.escapeHtml(attr.name)
            val encodedAttrValue = Util.escapeHtml(attr.value)
            builder.append(s""" $encodedAttrName="$encodedAttrValue"""")
            i += 1
          }
          builder.append(">")
          i = 0
          val nodes = element.childNodes
          while (i < nodes.length) {
            f(nodes.item(i), builder)
            i += 1
          }
          builder.append(s"</$encodedTagName>")
          builder
      }
    }

    f(node).toString()
  }
}