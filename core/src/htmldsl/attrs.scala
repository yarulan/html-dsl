package htmldsl

object Attr {
  def apply(name: String, value: String): ValuedAttr = ValuedAttr(name, value)
  def apply(name: String): NoValueAttr = NoValueAttr(name)
}

sealed trait Attr

case class ValuedAttr(name: String, value: String) extends Attr

case class NoValueAttr(name: String) extends Attr {
  def :=(rendered: Boolean): Attr = if (rendered) this else NoAttr
}

object NoAttr extends Attr

case class AttrKey(name: String) {
  def :=(value: String): ValuedAttr = Attr(name, value)
  def :=(value: Option[String]): Attr = value.map(value => Attr(name, value)).getOrElse(NoAttr)
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
  val checked = NoValueAttr("checked")
  val readonly = Attr("readonly")
  val disabled = Attr("disabled")
}