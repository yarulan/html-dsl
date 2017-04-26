package htmldsl.dom

import scala.scalajs.js

@js.native
trait Document extends Node with NodeSelector with DocumentEvent with ParentNode with PageVisibility {
  def implementation: DOMImplementation

  @deprecated("Not supported by all browsers", "forever")
  def xmlStandalone: Boolean

  def characterSet: String

  def doctype: DocumentType

  def documentElement: Element

  def documentURI: String

  def styleSheets: StyleSheetList

  def lastModified: String

  def getElementById(elementId: String): Element

  def getElementsByName(elementName: String): NodeList

  def getElementsByTagName(tagname: String): NodeList

  def getElementsByTagNameNS(namespaceURI: String, localName: String): NodeList

  def getElementsByClassName(classNames: String): NodeList

  def elementFromPoint(x: Double, y: Double): Element

  def adoptNode(source: Node): Node

  def evaluate(xpathExpression: String, contextNode: Node,
    namespaceResolver: XPathNSResolver, resultType: Int,
    result: XPathResult): XPathResult

  def evaluate(xpathExpression: String, contextNode: Node,
    namespaceResolver: js.Function1[String, String], resultType: Int,
    result: XPathResult): XPathResult

  def createNSResolver(node: Node): XPathNSResolver

  def importNode(importedNode: Node, deep: Boolean): Node

  def createElement(tagName: String): Element

  def createElementNS(namespaceURI: String, qualifiedName: String): Element

  def createAttribute(name: String): Attr

  def createAttributeNS(namespaceURI: String, qualifiedName: String): Attr

  def createProcessingInstruction(target: String, data: String): ProcessingInstruction

  def createCDATASection(data: String): CDATASection

  def createRange(): Range

  def createComment(data: String): Comment

  def createDocumentFragment(): DocumentFragment

  def createStyleSheet(href: String, index: Int): CSSStyleSheet

  def createTextNode(data: String): Text

  def createNodeIterator(root: Node, whatToShow: Int, filter: NodeFilter, entityReferenceExpansion: Boolean): NodeIterator

  def createTreeWalker(root: Node, whatToShow: Int, filter: NodeFilter, entityReferenceExpansion: Boolean): TreeWalker

  @deprecated("Non standard.", "forever")
  def releaseCapture(): Unit
}