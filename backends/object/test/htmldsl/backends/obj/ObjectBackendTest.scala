package htmldsl.backends.obj

import htmldsl.backends.`object`.ObjectBackend
import htmldsl.{Backend, DslTest, nodeToRenderable}
import org.scalajs.dom.raw.Element
import org.scalatest.{BeforeAndAfter, Matchers}

class ObjectBackendTest extends DslTest with Matchers with BeforeAndAfter {
  before {
    Backend.current = ObjectBackend
  }

  override def check(element: Element, expectedHtml: String): Unit = {
    element.toHtmlString shouldBe expectedHtml
  }
}