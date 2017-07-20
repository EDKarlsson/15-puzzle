package main.solver

import java.io.FileReader

import main.game.model.{Board, Piece}

import scala.collection.mutable

class Solver(board: Board) {
  var edges: Array[Array[Int]] = Array.ofDim[Int](16, 16)
  var nodes: List[Node] = List[Node]()

  def init(): Unit = {
    for (i <- 0 until 16) {
      for (j <- 0 until 16) {
        edges(i)(j) = 0
      }
    }
  }

  def readEdgesFromFile(): Unit = {
    val source = scala.io.Source.fromFile("src/resources/edges.txt") // .getLines()
    val lines = source.getLines()
    var count = 0
    for (l <- lines) {
      val s = l.split(" ")
      val x = s(0).toInt - 1
      val y = s(1).toInt - 1
      edges(x)(y) = 1
      val node: List[Node] = List(new Node(x,y))
      nodes = nodes ::: node
    }
    for(n <- nodes){
      println(n.toString)
    }
    source.close()
  }

  def printEdges(): Unit = {
    print("\t")
    for (i <- 0 until 16) {
      print(i + "\t")
    }
    println()
    for (i <- 0 until 16) {
      print(i + ":\t")
      for (j <- 0 until 16) {
        print(edges(i)(j) + "\t")
      }
      println()
    }
  }

  def depthFirstSearch(startVal: Int): Unit ={
    val piece: Piece = board.findPiece(startVal)
    var stack : List[Int] = List[Int]()
  }
}
