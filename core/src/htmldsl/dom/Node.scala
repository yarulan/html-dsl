package htmldsl.dom

import scala.scalajs.js

@js.native
trait Node extends EventTarget {
  def appendChild(newChild: Node): Node
  def childNodes: NodeList
  def attributes: NamedNodeMap
  def nodeType: Int
}

@js.native
trait NodeList extends DOMList[Node]

@js.native
trait DOMList[T] extends js.Object {
  def length: Int

  def item(index: Int): T
}

@js.native
trait NamedNodeMap extends js.Object {
  def length: Int

  def item(index: Int): Attr
}

@js.native
trait Attr extends js.Object {
  var value: String

  def name: String
}