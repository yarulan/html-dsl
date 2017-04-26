package htmldsl.dom

import scala.scalajs.js

@js.native
trait Storage extends js.Object {
  var length: Int

  def getItem(key: String): String

  def setItem(key: String, data: String): Unit

  def clear(): Unit

  def removeItem(key: String): Unit

  def key(index: Int): String
}