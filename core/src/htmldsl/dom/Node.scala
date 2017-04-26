package htmldsl.dom

import scala.scalajs.js

@js.native
trait Node extends EventTarget {
  def appendChild(newChild: Node): Node
}