package htmldsl.dom

import scala.scalajs.js

@js.native
trait XPathNSResolver extends js.Object {
  def lookupNamespaceURI(prefix: String): String
}