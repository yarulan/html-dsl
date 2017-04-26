package htmldsl

import htmldsl.dom.{Element, HTMLElement, HTMLInputElement}

trait HtmlTags {
  val html = new DslWord[HTMLElement]("html")

  val head = new DslWord[HTMLElement]("head")
  val meta = new DslWord[HTMLElement]("meta")
  val title = new DslWord[HTMLElement]("title")
  val link = new DslWord[HTMLElement]("link")
  val script = new DslWord[HTMLElement]("script")

  val body = new DslWord[HTMLElement]("body")

  val section = new DslWord[HTMLElement]("section")
  val header = new DslWord[HTMLElement]("header")
  val footer = new DslWord[HTMLElement]("footer")

  val h1 = new DslWord[HTMLElement]("h1")
  val h2 = new DslWord[HTMLElement]("h2")
  val h3 = new DslWord[HTMLElement]("h3")
  val h4 = new DslWord[HTMLElement]("h4")
  val h5 = new DslWord[HTMLElement]("h5")
  val h6 = new DslWord[HTMLElement]("h6")

  val div = new DslWord[HTMLElement]("div")
  val span = new DslWord[HTMLElement]("span")
  val p = new DslWord[HTMLElement]("p")
  val a = new DslWord[HTMLElement]("a")
  val ul = new DslWord[HTMLElement]("ul")
  val li = new DslWord[HTMLElement]("li")

  val form = new DslWord[HTMLElement]("form")
  val label = new DslWord[HTMLElement]("label")
  val input = new DslWord[HTMLInputElement]("input")
  val button = new DslWord[HTMLElement]("button")

  val b = new DslWord[HTMLElement]("b")
  val strong = new DslWord[HTMLElement]("strong")
  val i = new DslWord[HTMLElement]("i")
  val em = new DslWord[HTMLElement]("em")
  val mark = new DslWord[HTMLElement]("mark")
  val small = new DslWord[HTMLElement]("small")
  val del = new DslWord[HTMLElement]("del")
  val ins = new DslWord[HTMLElement]("ins")
  val sub = new DslWord[HTMLElement]("sub")
  val sup = new DslWord[HTMLElement]("sup")
}