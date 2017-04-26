package htmldsl.dom

import scala.scalajs.js

@js.native
trait Text extends CharacterData {
  def wholeText: String

  def splitText(offset: Int): Text
}