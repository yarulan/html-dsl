package htmldsl.dom

import scala.scalajs.js

@js.native
trait StyleSheet extends js.Object {
  def href: String

  def disabled: Boolean

  def ownerNode: Node

  def parentStyleSheet: StyleSheet

  def media: MediaList

  def `type`: String

  def title: String
}