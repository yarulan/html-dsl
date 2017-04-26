package htmldsl.dom

import scala.scalajs.js

@js.native
trait TreeWalker extends js.Object {
  def whatToShow: Int

  def filter: NodeFilter

  def root: Node

  var currentNode: Node

  @deprecated("Obsolete.", "WHATWG DOM")
  def expandEntityReferences: Boolean

  def previousSibling(): Node

  def lastChild(): Node

  def nextSibling(): Node

  def nextNode(): Node

  def parentNode(): Node

  def firstChild(): Node

  def previousNode(): Node
}