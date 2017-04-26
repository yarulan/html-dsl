package htmldsl.dom

import scala.scalajs.js

@js.native
trait ParentNode extends js.Object {
  def children: HTMLCollection

  def firstElementChild: Element

  def lastElementChild: Element

  def childElementCount: Int
}