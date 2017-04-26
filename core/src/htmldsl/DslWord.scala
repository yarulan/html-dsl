package htmldsl

import htmldsl.Util.buildElement
import htmldsl.dom.Element

class DslWord[T <: Element](tagName: String) {
  def apply(body: => Any): T = buildElement[T](tagName, Seq.empty, body)
  def apply(attrs: Attr*): T = buildElement[T](tagName, attrs, {})
}