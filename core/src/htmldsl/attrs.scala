package htmldsl

object Attr {
  def apply(name: String): Attr = Attr(name, None)
}

case class Attr(name: String, value: Option[String])

object NoAttr extends Attr("noattr", None)

case class AttrKey(name: String) {
  def :=(value: String): Attr = Attr(name, Some(value))
  def :=(value: Option[String]): Attr = value.map(value => Attr(name, Some(value))).getOrElse(NoAttr)
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
  val placeholder = AttrKey("placeholder")
  val checked = Attr("checked")
  val readonly = Attr("readonly")
  val disabled = Attr("disabled")
}