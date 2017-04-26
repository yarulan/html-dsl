package htmldsl.dom

import scala.scalajs.js

@js.native
trait NamedNodeMap extends js.Object {
  def length: Int

  def removeNamedItemNS(namespaceURI: String,
    localName: String): Attr

  def item(index: Int): Attr

  @scala.scalajs.js.annotation.JSBracketAccess
  def apply(index: Int): Attr

  @scala.scalajs.js.annotation.JSBracketAccess
  def update(index: Int, v: Attr): Unit

  def removeNamedItem(name: String): Attr

  def getNamedItem(name: String): Attr

  def setNamedItem(arg: Attr): Attr

  def getNamedItemNS(namespaceURI: String, localName: String): Attr

  def setNamedItemNS(arg: Attr): Attr
}