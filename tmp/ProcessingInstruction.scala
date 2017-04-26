package htmldsl.dom

import scala.scalajs.js

@js.native
trait ProcessingInstruction extends Node {
  def target: String

  def data: String
}