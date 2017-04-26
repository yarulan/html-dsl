package htmldsl.dom

import scala.scalajs.js

@js.native
trait Element extends Node with NodeSelector with ParentNode with NonDocumentTypeChildNode {
  def setAttribute(name: String, value: String): Unit
  def tagName: String
  var innerHTML: String
}

@js.native
trait HTMLElement extends Element {
  var onkeydown: js.Function1[KeyboardEvent, _]
  var onkeyup: js.Function1[KeyboardEvent, _]
  var onkeypress: js.Function1[KeyboardEvent, _]
  var onclick: js.Function1[MouseEvent, _]
}

@js.native
trait HTMLInputElement extends HTMLElement {
  var value: String
}

@js.native
trait MouseEvent extends UIEvent with ModifierKeyEvent