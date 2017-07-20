package main.solver

import java.io.FileReader

import main.game.model.{Board, Piece}

import scala.collection.mutable

class Solver(board: Board) {
  var edges = Array.ofDim[Int](16,16)

  def init(): Unit = {
    for (i <- 0 until 16){
      for (j <- 0 until 16) {
        edges(i)(j) = 0
      }
    }
  }

  def readEdgesFromFile(): Unit ={
    val lines = scala.io.Source.fromFile("src/resources/edges.txt").getLines()
    for(l <- lines){
      var s = l.split(" ")
      var x = s(0).toInt - 1
      var y = s(1).toInt - 1
      edges(x)(y) = 1
    }
  }

  def printEdges(): Unit ={
    print("\t")
    for(i <- 0 until 16){
      print(i + "\t")
    }
    println()
    for (i <- 0 until 16){
      print(i + ":\t")
      for (j <- 0 until 16) {
        print(edges(i)(j) + "\t")
      }
      println()
    }
  }

}
