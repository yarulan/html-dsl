package htmldsl.dom

import scala.scalajs.js

@js.native
trait CharacterData extends Node with NonDocumentTypeChildNode {
  def length: Int

  var data: String

  def deleteData(offset: Int, count: Int): Unit

  def replaceData(offset: Int, count: Int, arg: String): Unit

  def appendData(arg: String): Unit

  def insertData(offset: Int, arg: String): Unit

  def substringData(offset: Int, count: Int): String
}