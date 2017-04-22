package htmldsl.html

import scala.scalajs.js

@js.native
trait Node extends js.Object {
  def appendChild(child: Node)
}

@js.native
trait Element extends Node {
  def setAttribute(name: String, value: String)
  def getAttribute(name: String): String
  def removeAttribute(name: String)
}

@js.native
trait CharacterData extends Node

@js.native
trait HTMLElement extends Element

@js.native
trait SVGElement extends Element

@js.native
trait HTMLDivElement extends HTMLElement

@js.native
trait HTMLSpanElement extends HTMLElement

@js.native
trait HTMLFormElement extends HTMLElement

@js.native
trait HTMLLabelElement extends HTMLElement

@js.native
trait HTMLInputElement extends HTMLElement

@js.native
trait Text extends CharacterData

