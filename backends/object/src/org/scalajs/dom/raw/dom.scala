package org.scalajs.dom.raw

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer
import scala.scalajs.js

abstract class Element(val tagName: String)
  extends Node with NodeSelector with ParentNode
    with NonDocumentTypeChildNode {

  private val attrMap = mutable.HashMap[String, String]()
  private val attrList = mutable.ArrayBuffer[(String, String)]()

  def setAttribute(name: String, value: String): Unit = {
    val old = attrMap.put(name, value)
    if (old.isEmpty) {
      attrList.+=((name, value))
    }
  }

  override val nodeType: Int = Node.ELEMENT_NODE

  def attributes: NamedNodeMap = new NamedNodeMap {
    override def item(index: Int): Attr = {
      val attr = attrList(index)
      new Attr(attr._1, attr._2)
    }

    override def length: Int = attrList.size
  }

  var innerHTML: String = _
}

class Attr(val name: String, var value: String) {
}

abstract class Node extends EventTarget {
  private val nodes = ArrayBuffer[Node]()

  def appendChild(newChild: Node): Node = {
    nodes += newChild
    newChild
  }

  def removeChild(oldChild: Node): Node = {
    val i = nodes.indexOf(oldChild)
    if (i > -1) {
      nodes.remove(i)
      oldChild
    } else null
  }

  def childNodes: NodeList = new NodeList {
    override def item(index: Int): Node = nodes(index)

    override def length: Int = nodes.length
  }

  val nodeType: Int
}

class EventTarget

trait NodeSelector

trait ParentNode

trait NonDocumentTypeChildNode

class HTMLElement(tagName: String) extends Element(tagName)

class Text(override var data: String) extends CharacterData {
  override val nodeType: Int = Node.TEXT_NODE
}

abstract class CharacterData extends Node with NonDocumentTypeChildNode {
  var data: String
}

abstract class NamedNodeMap {
  def item(index: Int): Attr
  def length: Int
}

abstract class NodeList extends DOMList[Node]

trait DOMList[T] extends js.Object {
  private val items = ArrayBuffer[T]()

  def length: Int

  def item(index: Int): T
}

object Node extends js.Object {
  val TEXT_NODE: Int = 3

  val ELEMENT_NODE: Int = 1
}