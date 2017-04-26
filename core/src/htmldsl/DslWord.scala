package htmldsl

import htmldsl.dom.{Element, _}

class DslWord[T <: Element](tagName: String) {
  // Non-leaf elements

  def apply(body: => Any)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(), body).asInstanceOf[T]
  }

  def apply(a1: Attr, body: => Any)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1), body).asInstanceOf[T]
  }

  def apply(a1: Attr, a2: Attr, body: => Any)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2), body).asInstanceOf[T]
  }

  def apply(a1: Attr, a2: Attr, a3: Attr, body: => Any)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3), body).asInstanceOf[T]
  }

  def apply(a1: Attr, a2: Attr, a3: Attr, a4: Attr, body: => Any)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4), body).asInstanceOf[T]
  }

  def apply(a1: Attr, a2: Attr, a3: Attr, a4: Attr, a5: Attr, body: => Any)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5), body).asInstanceOf[T]
  }

  def apply(a1: Attr, a2: Attr, a3: Attr, a4: Attr, a5: Attr, a6: Attr, body: => Any)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5, a6), body).asInstanceOf[T]
  }

  def apply(a1: Attr, a2: Attr, a3: Attr, a4: Attr, a5: Attr, a6: Attr, a7: Attr, body: => Any)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5, a6, a7), body).asInstanceOf[T]
  }

  def apply(a1: Attr, a2: Attr, a3: Attr, a4: Attr, a5: Attr, a6: Attr, a7: Attr, a8: Attr, body: => Any)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5, a6, a7, a8), body).asInstanceOf[T]
  }

  def apply(a1: Attr, a2: Attr, a3: Attr, a4: Attr, a5: Attr, a6: Attr, a7: Attr, a8: Attr, a9: Attr, body: => Any)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5, a6, a7, a8, a9), body).asInstanceOf[T]
  }

  def apply(a1: Attr, a2: Attr, a3: Attr, a4: Attr, a5: Attr, a6: Attr, a7: Attr, a8: Attr, a9: Attr, a10: Attr, body: => Any)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10), body).asInstanceOf[T]
  }

  // Leaf elements

  def apply(a1: Attr)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1)).asInstanceOf[T]
  }

  def apply(a1: Attr, a2: Attr)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2)).asInstanceOf[T]
  }

  def apply(a1: Attr, a2: Attr, a3: Attr)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3)).asInstanceOf[T]
  }

  def apply(a1: Attr, a2: Attr, a3: Attr, a4: Attr)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4)).asInstanceOf[T]
  }

  def apply(a1: Attr, a2: Attr, a3: Attr, a4: Attr, a5: Attr)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5)).asInstanceOf[T]
  }

  def apply(a1: Attr, a2: Attr, a3: Attr, a4: Attr, a5: Attr, a6: Attr)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5, a6)).asInstanceOf[T]
  }

  def apply(a1: Attr, a2: Attr, a3: Attr, a4: Attr, a5: Attr, a6: Attr, a7: Attr)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5, a6, a7)).asInstanceOf[T]
  }

  def apply(a1: Attr, a2: Attr, a3: Attr, a4: Attr, a5: Attr, a6: Attr, a7: Attr, a8: Attr)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5, a6, a7, a8)).asInstanceOf[T]
  }

  def apply(a1: Attr, a2: Attr, a3: Attr, a4: Attr, a5: Attr, a6: Attr, a7: Attr, a8: Attr, a9: Attr)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5, a6, a7, a8, a9)).asInstanceOf[T]
  }

  def apply(a1: Attr, a2: Attr, a3: Attr, a4: Attr, a5: Attr, a6: Attr, a7: Attr, a8: Attr, a9: Attr, a10: Attr)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10)).asInstanceOf[T]
  }
}