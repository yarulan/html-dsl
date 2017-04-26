package htmldsl.dom

import scala.scalajs.js

@js.native
trait DocumentType extends Node {
  def name: String

  @deprecated("Obsolete.", "WHATWG DOM")
  def notations: NamedNodeMap

  def systemId: String

  @deprecated("Obsolete.", "WHATWG DOM")
  def internalSubset: String

  @deprecated("Obsolete.", "WHATWG DOM")
  def entities: NamedNodeMap

  def publicId: String
}