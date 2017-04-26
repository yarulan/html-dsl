package htmldsl.dom

import scala.scalajs.js

@js.native
abstract class Blob(blobParts: js.Array[js.Any], options: BlobPropertyBag) extends js.Object {
  def `type`: String

  def size: Double

  def slice(start: Double, end: Double, contentType: String): Blob

  def close(): Unit
}