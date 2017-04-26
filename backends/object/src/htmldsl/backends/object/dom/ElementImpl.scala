package htmldsl.backends.`object`.dom

import htmldsl.dom._

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

class ElementImpl(override val tagName: String) extends Element with NodeImpl {
  private val attrMap = mutable.HashMap[String, String]()
  private val attrList = mutable.ArrayBuffer[(String, String)]()

  override def setAttribute(name: String, value: String): Unit = {
    val old = attrMap.put(name, value)
    if (old.isEmpty) {
      attrList.+=((name, value))
    }
  }

  override def nodeType: Int = NodeImpl.ELEMENT_NODE

  override def attributes: NamedNodeMap = new NamedNodeMap {
    override def item(index: Int): Attr = {
      val attr = attrList(index)
      new Attr {
        override def name: String = attr._1
        override var value: String = attr._2
      }
    }

    override def length: Int = attrList.size
  }

  override var innerHTML: String = _
}

trait NodeImpl extends Node {
  private val nodes = ArrayBuffer[Node]()

  override def appendChild(newChild: Node): Node = {
    nodes += newChild
    newChild
  }

  override def childNodes: NodeList = new NodeList {
    override def item(index: Int): Node = nodes(index)

    override def length: Int = nodes.length
  }
}

class TextImpl(override var data: String) extends Text with CharacterDataImpl {
  override def nodeType: Int = NodeImpl.TEXT_NODE

  override def attributes: NamedNodeMap = ???
}

trait CharacterDataImpl extends CharacterData with NodeImpl

object NodeImpl {
  val ELEMENT_NODE = 1
  val TEXT_NODE = 3
}