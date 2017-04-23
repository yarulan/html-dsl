package htmldsl.dom

import org.scalajs.dom.document
import org.scalajs.dom.raw.Node
import org.scalatest.{FreeSpec, Matchers}

class DomBackendTest extends FreeSpec with Matchers {
  "DomBackend should" - {
    "render html" in {
      val f = form(`class` := "form-horizontal") {
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

      val wrapper = document.createElement("div")
      wrapper.appendChild(f)
      wrapper.innerHTML shouldBe """<form class="form-horizontal"><div class="form-group"><label class="control-label col-sm-2" for="email">Email</label><div class="col-sm-10"><input type="email" class="form-control" id="email" placeholder="Enter email"></div></div></form>"""
    }
  }
}