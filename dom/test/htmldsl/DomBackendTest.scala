package htmldsl

import org.scalatest.{FunSuite, Matchers}
import htmldsl.dom._

class DomBackendTest extends FunSuite with Matchers {
  test("it") {
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
    f.getAttribute("class") shouldBe "form-horizontal"
  }
}
