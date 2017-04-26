package htmldsl.dom

import scala.scalajs.js

trait WindowBase64 extends js.Object {
  def btoa(rawString: String): String

  def atob(encodedString: String): String
}