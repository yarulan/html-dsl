package htmldsl.dom

import scala.scalajs.js

@js.native
trait NodeFilter extends js.Object {
  def acceptNode(n: Node): Int
}