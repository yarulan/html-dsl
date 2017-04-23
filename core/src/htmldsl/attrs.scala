package htmldsl

case class Attr(name: String, value: String)

case class AttrKey(name: String) {
  def :=(value: String): Attr = Attr(name, value)
}

trait AttrKeys {
  val `class` = AttrKey("class")
  val `for` = AttrKey("for")
  val `type` = AttrKey("type")
  val id = AttrKey("id")
  val placeholder = AttrKey("placeholder")
}