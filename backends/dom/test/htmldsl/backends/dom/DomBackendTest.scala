package htmldsl.backends.dom

import htmldsl.Backend
import htmldsl.dom._
import org.scalatest.{BeforeAndAfter, Matchers}

class DomBackendTest extends htmldsl.DslTest with Matchers with BeforeAndAfter {
  before {
    Backend.current = DomBackend
  }

  override def check(element: Element, expectedHtml: String): Unit = {
    element.toHtmlString.toLowerCase shouldBe expectedHtml
  }
}