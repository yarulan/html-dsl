package htmldsl

import htmldsl.dom.{Element, _}

import Util.buildElement

trait HtmlTags {
  def html: Element = buildElement[Element]("html", Seq.empty, {})
  def html(body: => Any): Element = buildElement[Element]("html", Seq.empty, body)
  def html(attrs: Attr*): Element = buildElement[Element]("html", attrs, {})

  def head: Element = buildElement[Element]("head", Seq.empty, {})
  def head(body: => Any): Element = buildElement[Element]("head", Seq.empty, body)
  def head(attrs: Attr*): Element = buildElement[Element]("head", attrs, {})

  def meta: Element = buildElement[Element]("meta", Seq.empty, {})
  def meta(body: => Any): Element = buildElement[Element]("meta", Seq.empty, body)
  def meta(attrs: Attr*): Element = buildElement[Element]("meta", attrs, {})

  def title: Element = buildElement[Element]("title", Seq.empty, {})
  def title(body: => Any): Element = buildElement[Element]("title", Seq.empty, body)
  def title(attrs: Attr*): Element = buildElement[Element]("title", attrs, {})

  def link: Element = buildElement[Element]("link", Seq.empty, {})
  def link(body: => Any): Element = buildElement[Element]("link", Seq.empty, body)
  def link(attrs: Attr*): Element = buildElement[Element]("link", attrs, {})

  def script: Element = buildElement[Element]("script", Seq.empty, {})
  def script(body: => Any): Element = buildElement[Element]("script", Seq.empty, body)
  def script(attrs: Attr*): Element = buildElement[Element]("script", attrs, {})

  def body: Element = buildElement[Element]("body", Seq.empty, {})
  def body(body: => Any): Element = buildElement[Element]("body", Seq.empty, body)
  def body(attrs: Attr*): Element = buildElement[Element]("body", attrs, {})

  def section: Element = buildElement[Element]("section", Seq.empty, {})
  def section(body: => Any): Element = buildElement[Element]("section", Seq.empty, body)
  def section(attrs: Attr*): Element = buildElement[Element]("section", attrs, {})

  def header: Element = buildElement[Element]("header", Seq.empty, {})
  def header(body: => Any): Element = buildElement[Element]("header", Seq.empty, body)
  def header(attrs: Attr*): Element = buildElement[Element]("header", attrs, {})

  def footer: Element = buildElement[Element]("footer", Seq.empty, {})
  def footer(body: => Any): Element = buildElement[Element]("footer", Seq.empty, body)
  def footer(attrs: Attr*): Element = buildElement[Element]("footer", attrs, {})

  def h1: Element = buildElement[Element]("h1", Seq.empty, {})
  def h1(body: => Any): Element = buildElement[Element]("h1", Seq.empty, body)
  def h1(attrs: Attr*): Element = buildElement[Element]("h1", attrs, {})

  def h2: Element = buildElement[Element]("h2", Seq.empty, {})
  def h2(body: => Any): Element = buildElement[Element]("h2", Seq.empty, body)
  def h2(attrs: Attr*): Element = buildElement[Element]("h2", attrs, {})

  def h3: Element = buildElement[Element]("h3", Seq.empty, {})
  def h3(body: => Any): Element = buildElement[Element]("h3", Seq.empty, body)
  def h3(attrs: Attr*): Element = buildElement[Element]("h3", attrs, {})

  def h4: Element = buildElement[Element]("h4", Seq.empty, {})
  def h4(body: => Any): Element = buildElement[Element]("h4", Seq.empty, body)
  def h4(attrs: Attr*): Element = buildElement[Element]("h4", attrs, {})

  def h5: Element = buildElement[Element]("h5", Seq.empty, {})
  def h5(body: => Any): Element = buildElement[Element]("h5", Seq.empty, body)
  def h5(attrs: Attr*): Element = buildElement[Element]("h5", attrs, {})

  def h6: Element = buildElement[Element]("h6", Seq.empty, {})
  def h6(body: => Any): Element = buildElement[Element]("h6", Seq.empty, body)
  def h6(attrs: Attr*): Element = buildElement[Element]("h6", attrs, {})

  def div: Element = buildElement[Element]("div", Seq.empty, {})
  def div(body: => Any): Element = buildElement[Element]("div", Seq.empty, body)
  def div(attrs: Attr*): Element = buildElement[Element]("div", attrs, {})

  def span: Element = buildElement[Element]("span", Seq.empty, {})
  def span(body: => Any): Element = buildElement[Element]("span", Seq.empty, body)
  def span(attrs: Attr*): Element = buildElement[Element]("span", attrs, {})

  def p: Element = buildElement[Element]("p", Seq.empty, {})
  def p(body: => Any): Element = buildElement[Element]("p", Seq.empty, body)
  def p(attrs: Attr*): Element = buildElement[Element]("p", attrs, {})

  def a: Element = buildElement[Element]("a", Seq.empty, {})
  def a(body: => Any): Element = buildElement[Element]("a", Seq.empty, body)
  def a(attrs: Attr*): Element = buildElement[Element]("a", attrs, {})

  def ul: Element = buildElement[Element]("ul", Seq.empty, {})
  def ul(body: => Any): Element = buildElement[Element]("ul", Seq.empty, body)
  def ul(attrs: Attr*): Element = buildElement[Element]("ul", attrs, {})

  def li: Element = buildElement[Element]("li", Seq.empty, {})
  def li(body: => Any): Element = buildElement[Element]("li", Seq.empty, body)
  def li(attrs: Attr*): Element = buildElement[Element]("li", attrs, {})

  def form: Element = buildElement[Element]("form", Seq.empty, {})
  def form(body: => Any): Element = buildElement[Element]("form", Seq.empty, body)
  def form(attrs: Attr*): Element = buildElement[Element]("form", attrs, {})

  def label: Element = buildElement[Element]("label", Seq.empty, {})
  def label(body: => Any): Element = buildElement[Element]("label", Seq.empty, body)
  def label(attrs: Attr*): Element = buildElement[Element]("label", attrs, {})

  def input: Element = buildElement[Element]("input", Seq.empty, {})
  def input(body: => Any): Element = buildElement[Element]("input", Seq.empty, body)
  def input(attrs: Attr*): Element = buildElement[Element]("input", attrs, {})

  def button: Element = buildElement[Element]("button", Seq.empty, {})
  def button(body: => Any): Element = buildElement[Element]("button", Seq.empty, body)
  def button(attrs: Attr*): Element = buildElement[Element]("button", attrs, {})
}