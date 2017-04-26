package htmldsl.dom

import scala.scalajs.js

@js.native
trait CSSStyleSheet extends StyleSheet {
  var owningElement: Element

  var imports: StyleSheetList

  var isAlternate: Boolean

  var isPrefAlternate: Boolean

  var readOnly: Boolean

  var cssText: String

  var ownerRule: CSSRule

  var cssRules: CSSRuleList

  var id: String

  def addImport(bstrURL: String, lIndex: Int): Int

  def addPageRule(bstrSelector: String, bstrStyle: String, lIndex: Int): Int

  def insertRule(rule: String, index: Int): Int

  def removeRule(lIndex: Int): Unit

  def deleteRule(index: Int): Unit

  def addRule(bstrSelector: String, bstrStyle: String, lIndex: Int): Int

  def removeImport(lIndex: Int): Unit
}