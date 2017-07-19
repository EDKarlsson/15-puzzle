package main.solver

import main.game.model.Piece

class Node {
  var left: Node = null
  var right: Node = null
  var above: Node = null
  var below: Node = null
  var cost: Int = 0
  var piece: Piece = null
}
