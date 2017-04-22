package htmldsl.string.html

import htmldsl.string.notSupportedInStringBackend

import htmldsl.html

class nodes {

}

class Node extends html.Node {
  override def appendChild(child: html.Node): Unit = notSupportedInStringBackend()
}

class Element extends Node with html.Element {
  override def setAttribute(name: String, value: String): Unit = notSupportedInStringBackend()

  override def getAttribute(name: String): String = notSupportedInStringBackend()

  override def removeAttribute(name: String): Unit = notSupportedInStringBackend()
}