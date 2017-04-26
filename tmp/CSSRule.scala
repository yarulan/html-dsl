package htmldsl.dom

import scala.scalajs.js

@js.native
trait CSSRule extends js.Object {
  var cssText: String

  var parentStyleSheet: CSSStyleSheet

  var parentRule: CSSRule

  var `type`: Int

  var IMPORT_RULE: Int

  var MEDIA_RULE: Int

  var STYLE_RULE: Int

  var NAMESPACE_RULE: Int

  var PAGE_RULE: Int

  var UNKNOWN_RULE: Int

  var FONT_FACE_RULE: Int

  var CHARSET_RULE: Int

  var KEYFRAMES_RULE: Int

  var KEYFRAME_RULE: Int

  var VIEWPORT_RULE: Int
}