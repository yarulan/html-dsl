package htmldsl.dom

import scala.scalajs.js

@js.native
trait NodeSelector extends js.Object {
  def querySelectorAll(selectors: String): NodeList = js.native

  def querySelector(selectors: String): Element = js.native
}