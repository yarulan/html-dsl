package htmldsl.string
import org.scalajs.dom.Element
import org.scalatest.Matchers

class StringDslTest extends htmldsl.DslTest with Matchers {
  override implicit val backend = new StringBackend

  override def check(element: Element, expected: String): Unit = {
    check(element, expected, null)
  }

  override def check(element: Element, stringBackendExpected: String, domBackendExpected: String): Unit = {
    val actual = backend.builder.toString()
    backend.builder.clear()
    actual shouldBe stringBackendExpected
  }
}