package htmldsl.dom

import scala.scalajs.js

@js.native
trait IDBEnvironment extends js.Object {
  def indexedDB: IDBFactory
}