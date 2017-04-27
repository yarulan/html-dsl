package htmldsl

import htmldsl.Util.buildElement
import org.scalajs.dom.raw.Element


class DslWord[T <: Element](tagName: String) extends BaseDslWord[T, T](tagName, identity)

class DslWordForElementWithApply[T <: Element](tagName: String) extends BaseDslWord[T, Holder[T]](tagName, Holder(_))

class BaseDslWord[T <: Element, R](tagName: String, f: T => R) {
  def apply(body: => Any): R = f(buildElement[T](tagName, Seq.empty, body))
  def apply(attrs: Attr*): R = f(buildElement[T](tagName, attrs, {}))

  type A = Attr

  def apply(text: String): R = {
    f(buildElement[T](tagName, Seq.empty, Dsl.text(text)))
  }

  def apply(a1: A, text: String): R = {
    f(buildElement[T](tagName, Seq(a1), Dsl.text(text)))
  }
  /*
    def apply(a1: A, a2: A, text: String): T = {
      buildElement[T](tagName, Seq(a1, a2), Dsl.text(text))
    }

    def apply(a1: A, a2: A, a3: A, text: String): T = {
      buildElement[T](tagName, Seq(a1, a2, a3), Dsl.text(text))
    }

    def apply(a1: A, a2: A, a3: A, a4: A, text: String): T = {
      buildElement[T](tagName, Seq(a1, a2, a3, a4), Dsl.text(text))
    }

    def apply(a1: A, a2: A, a3: A, a4: A, a5: A, text: String): T = {
      buildElement[T](tagName, Seq(a1, a2, a3, a4, a5), Dsl.text(text))
    }

    def apply(a1: A, a2: A, a3: A, a4: A, a5: A, a6: A, text: String): T = {
      buildElement[T](tagName, Seq(a1, a2, a3, a4, a5, a6), Dsl.text(text))
    }

    def apply(a1: A, a2: A, a3: A, a4: A, a5: A, a6: A, a7: A, text: String): T = {
      buildElement[T](tagName, Seq(a1, a2, a3, a4, a5, a6, a7), Dsl.text(text))
    }

    def apply(a1: A, a2: A, a3: A, a4: A, a5: A, a6: A, a7: A, a8: A, text: String): T = {
      buildElement[T](tagName, Seq(a1, a2, a3, a4, a5, a6, a7, a8), Dsl.text(text))
    }

    def apply(a1: A, a2: A, a3: A, a4: A, a5: A, a6: A, a7: A, a8: A, a9: A, text: String): T = {
      buildElement[T](tagName, Seq(a1, a2, a3, a4, a5, a6, a7, a8, a9), Dsl.text(text))
    }

    def apply(a1: A, a2: A, a3: A, a4: A, a5: A, a6: A, a7: A, a8: A, a9: A, a10: A, text: String): T = {
      buildElement[T](tagName, Seq(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10), Dsl.text(text))
    }

  */
}