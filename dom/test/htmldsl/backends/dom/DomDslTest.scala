package htmldsl.backends.dom

import htmldsl.Backend
import htmldsl.dom._
import htmldsl.dom.window.document
import org.scalatest.{BeforeAndAfter, Matchers}

class DomDslTest extends htmldsl.DslTest with Matchers with BeforeAndAfter {
  override implicit val backend = DomBackend

  before {
    Backend.current = DomBackend
  }

  override def check(element: Element, expected: String): Unit = {
    check(element, null, expected)
  }

  override def check(element: Element, stringBackendExpected: String, domBackendExpected: String): Unit = {
    val wrapper = document.createElement("div")
    wrapper.appendChild(element)
    wrapper.innerHTML shouldBe domBackendExpected
  }
}