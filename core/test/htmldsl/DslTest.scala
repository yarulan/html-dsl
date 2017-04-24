package htmldsl

import org.scalajs.dom.Element
import org.scalatest.FreeSpec

abstract class DslTest extends FreeSpec {
  implicit val backend: Backend

  def check(element: Element, expected: String)

  val expectedHtml: String

  "Dsl should" - {
    "render html" in {
      val f = form(`class` := "form-horizontal", {
        div(`class` := "form-group", {
          val inputId = "email"
          label(`class` := "control-label col-sm-2", `for` := inputId, {
            text("Email")
          })
          div(`class` := "col-sm-10", {
            input(`type` := "email", `class` := "form-control", id := inputId, placeholder := "Enter email")
          })
        })
      })
      check(f, expectedHtml)
    }

    "allow custom tags" in {
      val e = 'div({
        'h1({
          text("Hello")
        })
      })
      check(e, """<div><h1>Hello</h1></div>""")
    }
  }
}