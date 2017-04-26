package htmldsl.dom

import scala.scalajs.js

@js.native
trait Node extends EventTarget {
  def nodeType: Int

  def previousSibling: Node

  def localName: String

  def namespaceURI: String

  var textContent: String

  def parentNode: Node

  def nextSibling: Node

  def nodeValue: String

  def lastChild: Node

  def childNodes: NodeList

  def nodeName: String

  def ownerDocument: Document

  def attributes: NamedNodeMap

  def firstChild: Node

  @deprecated("Obsolete.", "DOM4")
  def prefix: String

  def removeChild(oldChild: Node): Node

  def appendChild(newChild: Node): Node

  def isSupported(feature: String, version: String): Boolean

  def isEqualNode(arg: Node): Boolean

  def lookupPrefix(namespaceURI: String): String

  def isDefaultNamespace(namespaceURI: String): Boolean

  def compareDocumentPosition(other: Node): Int

  def normalize(): Unit

  def isSameNode(other: Node): Boolean

  def hasAttributes(): Boolean

  def lookupNamespaceURI(prefix: String): String

  def cloneNode(deep: Boolean): Node

  def hasChildNodes(): Boolean

  def replaceChild(newChild: Node, oldChild: Node): Node

  def insertBefore(newChild: Node, refChild: Node): Node
}