package htmldsl

import org.scalajs.dom.raw._

trait Tags {
  val div = new DslWord[HTMLDivElement]("div")
  val form = new DslWord[HTMLFormElement]("form")
  val label = new DslWord[HTMLLabelElement]("label")
  val input = new DslWord[HTMLInputElement]("input")
  val span = new DslWord[HTMLSpanElement]("span")
}
