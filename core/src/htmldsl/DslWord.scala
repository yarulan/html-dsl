package htmldsl

import org.scalajs.dom.raw.Element

class DslWord[T <: Element](tagName: String) {
  // Non-leaf elements

  def apply(body: => Any)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(), body).asInstanceOf[T]
  }

  def apply(a1: Option[Attr], body: => Any)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1).flatten, body).asInstanceOf[T]
  }

  def apply(a1: Option[Attr], a2: Option[Attr], body: => Any)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2).flatten, body).asInstanceOf[T]
  }

  def apply(a1: Option[Attr], a2: Option[Attr], a3: Option[Attr], body: => Any)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3).flatten, body).asInstanceOf[T]
  }

  def apply(a1: Option[Attr], a2: Option[Attr], a3: Option[Attr], a4: Option[Attr], body: => Any)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4).flatten, body).asInstanceOf[T]
  }

  def apply(a1: Option[Attr], a2: Option[Attr], a3: Option[Attr], a4: Option[Attr], a5: Option[Attr], body: => Any)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5).flatten, body).asInstanceOf[T]
  }

  def apply(a1: Option[Attr], a2: Option[Attr], a3: Option[Attr], a4: Option[Attr], a5: Option[Attr], a6: Option[Attr], body: => Any)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5, a6).flatten, body).asInstanceOf[T]
  }

  def apply(a1: Option[Attr], a2: Option[Attr], a3: Option[Attr], a4: Option[Attr], a5: Option[Attr], a6: Option[Attr], a7: Option[Attr], body: => Any)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5, a6, a7).flatten, body).asInstanceOf[T]
  }

  def apply(a1: Option[Attr], a2: Option[Attr], a3: Option[Attr], a4: Option[Attr], a5: Option[Attr], a6: Option[Attr], a7: Option[Attr], a8: Option[Attr], body: => Any)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5, a6, a7, a8).flatten, body).asInstanceOf[T]
  }

  def apply(a1: Option[Attr], a2: Option[Attr], a3: Option[Attr], a4: Option[Attr], a5: Option[Attr], a6: Option[Attr], a7: Option[Attr], a8: Option[Attr], a9: Option[Attr], body: => Any)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5, a6, a7, a8, a9).flatten, body).asInstanceOf[T]
  }

  def apply(a1: Option[Attr], a2: Option[Attr], a3: Option[Attr], a4: Option[Attr], a5: Option[Attr], a6: Option[Attr], a7: Option[Attr], a8: Option[Attr], a9: Option[Attr], a10: Option[Attr], body: => Any)(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10).flatten, body).asInstanceOf[T]
  }

  // Leaf elements

  def apply(a1: Option[Attr])(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1).flatten).asInstanceOf[T]
  }

  def apply(a1: Option[Attr], a2: Option[Attr])(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2).flatten).asInstanceOf[T]
  }

  def apply(a1: Option[Attr], a2: Option[Attr], a3: Option[Attr])(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3).flatten).asInstanceOf[T]
  }

  def apply(a1: Option[Attr], a2: Option[Attr], a3: Option[Attr], a4: Option[Attr])(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4).flatten).asInstanceOf[T]
  }

  def apply(a1: Option[Attr], a2: Option[Attr], a3: Option[Attr], a4: Option[Attr], a5: Option[Attr])(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5).flatten).asInstanceOf[T]
  }

  def apply(a1: Option[Attr], a2: Option[Attr], a3: Option[Attr], a4: Option[Attr], a5: Option[Attr], a6: Option[Attr])(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5, a6).flatten).asInstanceOf[T]
  }

  def apply(a1: Option[Attr], a2: Option[Attr], a3: Option[Attr], a4: Option[Attr], a5: Option[Attr], a6: Option[Attr], a7: Option[Attr])(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5, a6, a7).flatten).asInstanceOf[T]
  }

  def apply(a1: Option[Attr], a2: Option[Attr], a3: Option[Attr], a4: Option[Attr], a5: Option[Attr], a6: Option[Attr], a7: Option[Attr], a8: Option[Attr])(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5, a6, a7, a8).flatten).asInstanceOf[T]
  }

  def apply(a1: Option[Attr], a2: Option[Attr], a3: Option[Attr], a4: Option[Attr], a5: Option[Attr], a6: Option[Attr], a7: Option[Attr], a8: Option[Attr], a9: Option[Attr])(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5, a6, a7, a8, a9).flatten).asInstanceOf[T]
  }

  def apply(a1: Option[Attr], a2: Option[Attr], a3: Option[Attr], a4: Option[Attr], a5: Option[Attr], a6: Option[Attr], a7: Option[Attr], a8: Option[Attr], a9: Option[Attr], a10: Option[Attr])(implicit backend: Backend): T = {
    Dsl.tag(tagName, Seq(a1, a2, a3, a4, a5, a6, a7, a8, a9, a10).flatten).asInstanceOf[T]
  }
}