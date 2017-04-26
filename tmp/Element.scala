package htmldsl.dom

import scala.scalajs.js

@js.native
trait Element extends Node with NodeSelector with ParentNode with NonDocumentTypeChildNode {
  override def prefix: String

  var scrollTop: Double

  def clientLeft: Int

  var scrollLeft: Double

  def tagName: String

  def clientWidth: Int

  def scrollWidth: Int

  def clientHeight: Int

  def clientTop: Int

  def scrollHeight: Int

  var outerHTML: String

  var innerHTML: String

  var id: String

  var oncut: js.Function1[DragEvent, _]

  var oncopy: js.Function1[DragEvent, _]

  var onpaste: js.Function1[DragEvent, _]

  var accessKey: String

  var classList: DOMTokenList

  def scrollIntoView(top: Boolean): Unit

  def insertAdjacentHTML(where: String, html: String): Unit

  def getAttribute(name: String): String

  def getElementsByTagNameNS(namespaceURI: String, localName: String): NodeList

  def getElementsByClassName(classNames: String): NodeList

  def hasAttributeNS(namespaceURI: String, localName: String): Boolean

  def getBoundingClientRect(): ClientRect

  def getAttributeNS(namespaceURI: String, localName: String): String

  def getAttributeNodeNS(namespaceURI: String, localName: String): Attr

  def setAttributeNodeNS(newAttr: Attr): Attr

  def hasAttribute(name: String): Boolean

  def removeAttribute(name: String): Unit

  def setAttributeNS(namespaceURI: String, qualifiedName: String, value: String): Unit

  def getAttributeNode(name: String): Attr

  def getElementsByTagName(name: String): NodeList

  def getClientRects(): ClientRectList

  def setAttributeNode(newAttr: Attr): Attr

  def removeAttributeNode(oldAttr: Attr): Attr

  def setAttribute(name: String, value: String): Unit

  def removeAttributeNS(namespaceURI: String, localName: String): Unit
}