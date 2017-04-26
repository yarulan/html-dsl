package htmldsl

import htmldsl.dom.{Element, _}

import Util.buildElement

object HtmlTags extends HtmlTags

trait HtmlTags {
  def div: Element = buildElement[Element]("div", Seq.empty, {})
  def div(body: => Any): Element = buildElement[Element]("div", Seq.empty, body)
  def div(attrs: Attr*): Element = buildElement[Element]("div", attrs, {})

//  val html = new DslWord[HTMLElement]("html") // TODO: no corresponding element
//
//  val head = new DslWord[HTMLHeadElement]("head")
//
//  val meta = new DslWord[HTMLMetaElement]("meta")
//  val title = new DslWord[HTMLTitleElement]("title")
//  val link = new DslWord[HTMLLinkElement]("link")
//  val script = new DslWord[HTMLScriptElement]("script")
//
//  val body = new DslWord[HTMLBodyElement]("body")
//
//  val section = new DslWord[HTMLElement]("section") // TODO: no corresponding element
//  val header = new DslWord[HTMLElement]("header") // TODO: no corresponding element
//  val footer = new DslWord[HTMLElement]("footer") // TODO: no corresponding element
//
//  val h1 = new DslWord[HTMLHeadingElement]("h1")
//  val h2 = new DslWord[HTMLHeadingElement]("h2")
//  val h3 = new DslWord[HTMLHeadingElement]("h3")
//  val h4 = new DslWord[HTMLHeadingElement]("h4")
//  val h5 = new DslWord[HTMLHeadingElement]("h5")
//  val h6 = new DslWord[HTMLHeadingElement]("h6")

//  val div = new DslWord[HTMLDivElement]("div")
//  val span = new DslWord[HTMLSpanElement]("span")
//  val p = new DslWord[HTMLParagraphElement]("p")
//  val a = new DslWord[HTMLAnchorElement]("a")
//
//  val ul = new DslWord[HTMLUListElement]("ul")
//  val li = new DslWord[HTMLLIElement]("li")

//  val form = new DslWord[HTMLFormElement]("form")
//  val label = new DslWord[HTMLLabelElement]("label")
//  val input = new DslWord[HTMLInputElement]("input")
//  val button = new DslWord[HTMLButtonElement]("button")
//
//  val b = new DslWord[HTMLElement]("b") // TODO: no corresponding element
//  val strong = new DslWord[HTMLElement]("strong") // TODO: no corresponding element
//  val i = new DslWord[HTMLElement]("i") // TODO: no corresponding element
//  val em = new DslWord[HTMLElement]("em") // TODO: no corresponding element
//  val mark = new DslWord[HTMLElement]("mark") // TODO: no corresponding element
//  val small = new DslWord[HTMLElement]("small") // TODO: no corresponding element
//  val del = new DslWord[HTMLElement]("del") // TODO: no corresponding element
//  val ins = new DslWord[HTMLElement]("ins") // TODO: no corresponding element
//  val sub = new DslWord[HTMLElement]("sub") // TODO: no corresponding element
//  val sup = new DslWord[HTMLElement]("sup") // TODO: no corresponding element
}