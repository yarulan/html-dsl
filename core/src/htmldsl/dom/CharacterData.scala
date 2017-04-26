package htmldsl.dom

import scala.scalajs.js

@js.native
trait CharacterData extends Node with NonDocumentTypeChildNode {
  var data: String
}