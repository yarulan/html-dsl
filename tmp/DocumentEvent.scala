package htmldsl.dom

import scala.scalajs.js

@js.native
trait DocumentEvent extends js.Object {
  def createEvent(eventInterface: String): Event
}