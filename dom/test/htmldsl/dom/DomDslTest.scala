package htmldsl.dom

import org.scalajs.dom.Element
import org.scalajs.dom.document
import org.scalatest.Matchers

class DomDslTest extends htmldsl.DslTest with Matchers {
  override implicit val backend = DomBackend

  override def check(element: Element, expected: String): Unit = {
    val wrapper = document.createElement("div")
    wrapper.appendChild(element)
    wrapper.innerHTML shouldBe expected
  }

  override val expectedHtml = """<form class="form-horizontal"><div class="form-group"><label class="control-label col-sm-2" for="email">Email</label><div class="col-sm-10"><input type="email" class="form-control" id="email" placeholder="Enter email"></div></div></form>"""
}