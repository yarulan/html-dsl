package htmldsl

import org.scalajs.dom.raw._

trait HtmlTags {
  val html = new DslWord[HTMLElement]("html")

  val head = new DslWord[HTMLHeadElement]("head")
  val meta = new DslWord[HTMLMetaElement]("meta")
  val title = new DslWord[HTMLTitleElement]("title")
  val link = new DslWord[HTMLLinkElement]("link")
  val script = new DslWord[HTMLScriptElement]("script")

  val body = new DslWord[HTMLBodyElement]("body")

  val section = new DslWord[HTMLElement]("section") // no appropriate element
  val header = new DslWord[HTMLElement]("header")  // no appropriate element
  val footer = new DslWord[HTMLElement]("footer") // no appropriate element

  val h1 = new DslWord[HTMLHeadingElement]("h1")
  val h2 = new DslWord[HTMLHeadingElement]("h2")
  val h3 = new DslWord[HTMLHeadingElement]("h3")
  val h4 = new DslWord[HTMLHeadingElement]("h4")
  val h5 = new DslWord[HTMLHeadingElement]("h5")
  val h6 = new DslWord[HTMLHeadingElement]("h6")

  val div = new DslWord[HTMLDivElement]("div")
  val span = new DslWord[HTMLSpanElement]("span")
  val p = new DslWord[HTMLParagraphElement]("p")
  val a = new DslWord[HTMLAnchorElement]("a")
  val ul = new DslWord[HTMLUListElement]("ul")
  val li = new DslWord[HTMLLIElement]("li")

  val form = new DslWord[HTMLFormElement]("form")
  val label = new DslWord[HTMLLabelElement]("label")
  val input = new DslWord[HTMLInputElement]("input")
  val button = new DslWord[HTMLButtonElement]("button")

  val b = new DslWord[HTMLElement]("b") // no appropriate element
  val strong = new DslWord[HTMLElement]("strong") // no appropriate element
  val i = new DslWord[HTMLElement]("i") // no appropriate element
  val em = new DslWord[HTMLElement]("em") // no appropriate element
  val mark = new DslWord[HTMLElement]("mark") // no appropriate element
  val small = new DslWord[HTMLElement]("small") // no appropriate element
  val del = new DslWord[HTMLElement]("del") // no appropriate element
  val ins = new DslWord[HTMLElement]("ins") // no appropriate element
  val sub = new DslWord[HTMLElement]("sub") // no appropriate element
  val sup = new DslWord[HTMLElement]("sup") // no appropriate element
}