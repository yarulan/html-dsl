package htmldsl.string
import org.scalajs.dom.Element
import org.scalatest.Matchers

class StringDslTest extends htmldsl.DslTest with Matchers {
  override implicit val backend = new StringBackend

  override def check(element: Element, expected: String): Unit = {
    val actual = backend.builder.toString()
    backend.builder.clear()
    actual shouldBe expected
  }

  override val expectedHtml = """<form class="form-horizontal"><div class="form-group"><label class="control-label col-sm-2" for="email">Email</label><div class="col-sm-10"><input type="email" class="form-control" id="email" placeholder="Enter email"></input></div></div></form>"""
}