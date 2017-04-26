package htmldsl

import htmldsl.dom.Element

trait HtmlTags {
  val html = new DslWord[Element]("html")

  val head = new DslWord[Element]("head")
  val meta = new DslWord[Element]("meta")
  val title = new DslWord[Element]("title")
  val link = new DslWord[Element]("link")
  val script = new DslWord[Element]("script")

  val body = new DslWord[Element]("body")

  val section = new DslWord[Element]("section")
  val header = new DslWord[Element]("header")
  val footer = new DslWord[Element]("footer")

  val h1 = new DslWord[Element]("h1")
  val h2 = new DslWord[Element]("h2")
  val h3 = new DslWord[Element]("h3")
  val h4 = new DslWord[Element]("h4")
  val h5 = new DslWord[Element]("h5")
  val h6 = new DslWord[Element]("h6")

  val div = new DslWord[Element]("div")
  val span = new DslWord[Element]("span")
  val p = new DslWord[Element]("p")
  val a = new DslWord[Element]("a")
  val ul = new DslWord[Element]("ul")
  val li = new DslWord[Element]("li")

  val form = new DslWord[Element]("form")
  val label = new DslWord[Element]("label")
  val input = new DslWord[Element]("input")
  val button = new DslWord[Element]("button")

  val b = new DslWord[Element]("b")
  val strong = new DslWord[Element]("strong")
  val i = new DslWord[Element]("i")
  val em = new DslWord[Element]("em")
  val mark = new DslWord[Element]("mark")
  val small = new DslWord[Element]("small")
  val del = new DslWord[Element]("del")
  val ins = new DslWord[Element]("ins")
  val sub = new DslWord[Element]("sub")
  val sup = new DslWord[Element]("sup")
}