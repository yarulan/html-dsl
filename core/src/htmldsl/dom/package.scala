package htmldsl

import scala.scalajs.js

package object dom {
  lazy val window = js.Dynamic.global.asInstanceOf[Window]
}