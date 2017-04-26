package htmldsl

import htmldsl.dom.{Element, _}
import org.scalatest.FreeSpec
import Predef.{augmentString => _}

abstract class DslTest extends FreeSpec {
  def check(element: Element, expectedHtml: String)

  "DSL should" - {
    "provide nice syntax for" - {
      "tags with empty parens" in {
        val e = div()
        check(e, """<div></div>""")
      }

      "tags with attrs" in {
        val e = div(id := "main")
        check(e, """<div id="main"></div>""")
      }

      "tags with empty body" in {
        val e = div {}
        check(e, """<div></div>""")
      }

      "tags with parens and empty body" in {
        val e = div() {}
        check(e, """<div></div>""")
      }

      "tags with attrs and empty body" in {
        val e = div(id := "main") {}
        check(e, """<div id="main"></div>""")
      }

      "tags with children" in {
        val e = div {
          div()
        }
        check(e, """<div><div></div></div>""")
      }

      "tags with empty parens with children" in {
        val e = div() {
          div()
        }
        check(e, """<div><div></div></div>""")
      }

      "tags with attrs with children" in {
        val e = div(id := "main") {
          div()
        }
        check(e, """<div id="main"><div></div></div>""")
      }

      "more complex templates" in {
        val f = form(`class` := "form-horizontal") {
          div(`class` := "form-group") {
            val inputId = "email"
            label(`class` := "control-label col-sm-2", `for` := inputId) {
              text("email")
            }
            div(`class` := "col-sm-10") {
              input(`type` := "email", `class` := "form-control", id := inputId, placeholder := "enter email")
            }
          }
        }
        check(f, """<form class="form-horizontal"><div class="form-group"><label class="control-label col-sm-2" for="email">email</label><div class="col-sm-10"><input type="email" class="form-control" id="email" placeholder="enter email"></input></div></div></form>""")
      }

      "nodes with single text child node" in {
        check(span("hello"), """<span>hello</span>""")
        check(span(id := "hello", "hello"), """<span id="hello">hello</span>""")
      }
    }

    "allow to use" - {
      "strings as tag names" in {
        val e = "div"()
        check(e, """<div></div>""")
      }

      "strings as attribute keys" in {
        val e = div("id" := "main")
        check(e, """<div id="main"></div>""")
      }

      "symbols as tag names" in {
        val e = 'div()
        check(e, """<div></div>""")
      }

      "symbols as attribute keys" in {
        val e = div('id := "main")
        check(e, """<div id="main"></div>""")
      }
    }

    "support" - {
      "conditional rendering of attributes" in {
        check(div(id := None), """<div></div>""")
        check(div(id := Some("main")), """<div id="main"></div>""")
      }

      "attributes without values" in {
        check(input(disabled), """<input disabled=""></input>""")
      }

      "conditional rendering of attributes without values" in {
        check(input(disabled := true), """<input disabled=""></input>""")
        check(input(disabled := false), """<input></input>""")
      }
    }
  }
}