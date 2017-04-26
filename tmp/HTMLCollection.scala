package htmldsl.dom

import scala.scalajs.js

@js.native
trait HTMLCollection extends DOMList[Element] {
  @deprecated("Non-standard.", "forever")
  def item(nameOrIndex: js.Any, optionalIndex: js.Any): Element

  def namedItem(name: String): Element
}