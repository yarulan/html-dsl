package htmldsl.dom

import scala.scalajs.js

@js.native
trait WindowLocalStorage extends js.Object {
  def localStorage: Storage
}