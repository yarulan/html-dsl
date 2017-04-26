package htmldsl.dom

import scala.scalajs.js

@js.native
trait XPathResult extends js.Object {
  def booleanValue: Boolean
  def invalidIteratorState: Boolean
  def numberValue: Double
  def resultType: Int
  def singleNodeValue: Node
  def snapshotLength: Int
  def stringValue: String
  def iterateNext(): Node
  def snapshotItem(index: Int): Node
}