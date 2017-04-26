package htmldsl

import htmldsl.dom.{Element, _}
import org.scalatest.FreeSpec

abstract class DslTest extends FreeSpec {
  implicit val backend: Backend

  def check(element: Element, expected: String)
  def check(element: Element, stringBackendExpected: String, domBackendExpected: String)

  "DSL should allow to use" - {
    "just tags" in {
      val e = div
      check(e, """<div></div>""")
    }

    "tags with empty parens" in {
      val e = div()
      check(e, """<div></div>""")
    }

    "tags with attributes" in {
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
  }

//    div {
//    }
//    div() {
//    }
//    div(id := "main") {
//    }
//    div {
//      div
//    }
//    div() {
//      div
//    }
//    div(id := "main") {
//      div
//    }
//  }

//  "Dsl should" - {
//    "provide nice syntax for" - {
//      "single nodes" in {
//        val e = div()
//        check(e, """<div></div>""")
//      }
//
//      "nodes without attributes" in {
//        val e = div {
//          span {
//            text("Hello")
//          }
//          span {
//            text("World")
//          }
//        }
//        check(e, """<div><span>Hello</span><span>World</span></div>""")
//      }
//
//      "nodes with attributes" in {
//        val f = form(`class` := "form-horizontal", {
//          div(`class` := "form-group", {
//            val inputId = "email"
//            label(`class` := "control-label col-sm-2", `for` := inputId, {
//              text("Email")
//            })
//            div(`class` := "col-sm-10", {
//              input(`type` := "email", `class` := "form-control", id := inputId, placeholder := "Enter email")
//            })
//          })
//        })
//        check(f,
//          """<form class="form-horizontal"><div class="form-group"><label class="control-label col-sm-2" for="email">Email</label><div class="col-sm-10"><input type="email" class="form-control" id="email" placeholder="Enter email"></input></div></div></form>""",
//          """<form class="form-horizontal"><div class="form-group"><label class="control-label col-sm-2" for="email">Email</label><div class="col-sm-10"><input type="email" class="form-control" id="email" placeholder="Enter email"></div></div></form>"""
//        )
//      }
//    }
//
//    "allow to use symbols as tag names" in {
//      val e = 'div {
//          text("Hello")
//      }
//      check(e, """<div>Hello</div>""")
//    }
//
//    "allow to use symbols as attribute keys" in {
//      val e = div('foo := "bar", {
//        text("Hello")
//      })
//      check(e, """<div foo="bar">Hello</div>""")
//    }
//
//    "allow to use strings as attribute keys" in {
//      val e = div("foo" := "bar", {
//        text("Hello")
//      })
//      check(e, """<div foo="bar">Hello</div>""")
//    }
//
//    "support conditional rendering of attributes" in {
//      check(div(id := None), """<div></div>""")
//      check(div(id := Some("1")), """<div id="1"></div>""")
//    }
//
//    "support attributes without values" in {
//      check(input(disabled), """<input disabled></input>""", """<input disabled="">""")
//    }
//
//    "support conditional rendering of attributes without values" in {
//      check(input(disabled := true), """<input disabled></input>""", """<input disabled="">""")
//      check(input(disabled := false), """<input></input>""", """<input>""")
//    }
//  }
}