package htmldsl.dom

import scala.scalajs.js
import scala.scalajs.js.|

@js.native
trait PageVisibility extends js.Object {
  def hidden: Boolean

  def visibilityState: VisibilityState | String

  var visibilitychange: js.Function1[Event, _]
}