package main.game.model

class Piece(var pieceValue: Int = 0, var x: Int = 0, var y: Int = 0) {
  def isNextTo(piece:Piece): Boolean = {
    val res = Math.abs(this.x + this.y - piece.x - piece.y)
    res < 2 && res > 0
  }
}
