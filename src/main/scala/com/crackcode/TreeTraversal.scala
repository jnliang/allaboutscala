package com.crackcode

object TreeTraversal extends App {

  val root = new BinaryTreeNode("5")
  root.leftNode = Some(new BinaryTreeNode("3"))
  root.rightNode = Some(new BinaryTreeNode("7"))

  inOrderTraversal(Some(root))
  preOrderTraversal(Some(root))
  postOrderTraversal(Some(root))

  def inOrderTraversal(node: Option[BinaryTreeNode]): Unit = {
    if (node.isDefined) {
      inOrderTraversal(node.get.leftNode)
      println(node.get.value)
      inOrderTraversal(node.get.rightNode)
    }
  }

  def preOrderTraversal(node: Option[BinaryTreeNode]): Unit = {
    if (node.isDefined) {
      println(node.get.value)
      preOrderTraversal(node.get.leftNode)
      preOrderTraversal(node.get.rightNode)
    }
  }

  def postOrderTraversal(node: Option[BinaryTreeNode]): Unit = {
    if (node.isDefined) {
      postOrderTraversal(node.get.leftNode)
      postOrderTraversal(node.get.rightNode)
      println(node.get.value)
    }
  }
}

class BinaryTreeNode(val value: String) {

    var leftNode: Option[BinaryTreeNode] = None
    var rightNode: Option[BinaryTreeNode] = None

}
