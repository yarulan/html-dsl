package htmldsl.string

import org.scalatest.{FreeSpec, Matchers}

class StringBackendTest extends FreeSpec with Matchers {
  "StringBackend" - {
    "should render html" in {
      implicit val backend = new StringBackend

      form(`class` := "form-horizontal") {
        div(`class` := "form-group") {
          val inputId = "email"
          label(`class` := "control-label col-sm-2", `for` := inputId) {
            text("Email")
          }
          div(`class` := "col-sm-10") {
            input(`type` := "email", `class` := "form-control", id := inputId, placeholder := "Enter email")()
          }
        }
      }

      backend.builder.toString() shouldBe """<form class="form-horizontal"><div class="form-group"><label class="control-label col-sm-2" for="email">Email</label><div class="col-sm-10"><input type="email" class="form-control" id="email" placeholder="Enter email"></input></div></div></form>"""
    }
  }
}