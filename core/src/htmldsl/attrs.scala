package htmldsl

case class Attr(name: String, value: String)

case class AttrKey(name: String) {
  def :=(value: String): Option[Attr] = Some(Attr(name, value))
  def :=(value: Option[String]): Option[Attr] = value.map(Attr(name, _))
}

trait AttrKeys {
  val lang = AttrKey("lang")
  val charset = AttrKey("charset")
  val rel = AttrKey("rel")
  val href = AttrKey("href")

  val `class` = AttrKey("class")
  val cls = `class`
  val klass = `class`
  val clazz = `class`

  val `type` = AttrKey("type")
  val tpe = `type`



  val `for` = AttrKey("for")
  val id = AttrKey("id")
  val placeholder = AttrKey("placeholder")}