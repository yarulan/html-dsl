package htmldsl.dom

import scala.scalajs.js

@js.native
trait DOMImplementation extends js.Object {
  def createDocumentType(qualifiedName: String, publicId: String,
    systemId: String): DocumentType

  def createDocument(namespaceURI: String, qualifiedName: String,
    doctype: DocumentType): Document

  def hasFeature(feature: String, version: String): Boolean

  def hasFeature(feature: String): Boolean

  def createHTMLDocument(title: String): Document
}