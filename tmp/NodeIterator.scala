package htmldsl.dom

import scala.scalajs.js

@js.native
trait NodeIterator extends js.Object {
  var whatToShow: Int

  def filter: NodeFilter

  def root: Node

  @deprecated("Obsolete.", "WHATWG DOM")
  def expandEntityReferences: Boolean

  def nextNode(): Node

  def detach(): Unit

  def previousNode(): Node
}