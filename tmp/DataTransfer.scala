package htmldsl.dom

import scala.scalajs.js

@js.native
trait DataTransfer extends js.Object {
  var effectAllowed: String

  var dropEffect: String

  def clearData(format: String): Unit

  def setData(format: String, data: String): Unit

  def setDragImage(image: Element, x: Double, y: Double): Unit

  def getData(format: String): String

  def types: js.Array[String]

  def files: FileList
}