package htmldsl.dom

import org.scalajs.dom.{Element, document}
import org.scalatest.Matchers

class DomDslTest extends htmldsl.DslTest with Matchers {
  override implicit val backend = DomBackend

  override def check(element: Element, expected: String): Unit = {
    check(element, null, expected)
  }

  override def check(element: Element, stringBackendExpected: String, domBackendExpected: String): Unit = {
    val wrapper = document.createElement("div")
    wrapper.appendChild(element)
    wrapper.innerHTML shouldBe domBackendExpected
  }
}