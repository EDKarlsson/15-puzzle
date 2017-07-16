package main

class Piece(var pieceValue: Int = 0, var x: Int = 0, var y: Int = 0) {
  def isNextTo(piece:Piece): Boolean = {
    Math.abs(this.x + this.y - piece.x - piece.y) > 1
  }
}
