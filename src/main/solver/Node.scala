package main.solver

import main.game.model.Piece

class Node(x: Int, y: Int, cost: Int = 0, piece: Piece = null) {
  override def toString: String = {
    "x [ " + x.toString + " ] y [ " + y.toString + " ] cost [ " + cost + " ]"
  }
}
