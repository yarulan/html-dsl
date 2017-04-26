package htmldsl.dom

import scala.scalajs.js

@js.native
trait File extends Blob {
  @deprecated("Non-standard", "forever")
  def lastModifiedDate: js.Any

  def name: String
}