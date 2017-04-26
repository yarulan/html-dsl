package htmldsl.dom

import scala.scalajs.js

@js.native
trait Comment extends CharacterData {
  var text: String
}