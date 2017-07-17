package main.game.model

import scala.util.Random

class Board {
  private var gameBoard = Array(
    Array(new Piece(1, 0, 0), new Piece(2, 0, 1), new Piece(3, 0, 2), new Piece(4, 0, 3)),
    Array(new Piece(5, 1, 0), new Piece(6, 1, 1), new Piece(7, 1, 2), new Piece(8, 1, 3)),
    Array(new Piece(9, 2, 0), new Piece(10, 2, 1), new Piece(11, 2, 2), new Piece(12, 2, 3)),
    Array(new Piece(13, 3, 0), new Piece(14, 3, 1), new Piece(15, 3, 2), new Piece(-1, 3, 3)))

  private var emptyPiece: Piece = gameBoard(3)(3)

  def findPiece(pieceValue: Int): Piece = {
    for (i <- gameBoard) {
      for (j <- i) {
        if (j.pieceValue == pieceValue) {
          return j
        }
      }
    }
    null
  }

  def movePiece(pieceVal: Int): Unit = {
    if (pieceVal != 0) {
      val piece: Piece = findPiece(pieceVal)
      if (piece.isNextTo(emptyPiece)) {
        val temp = piece.pieceValue
        piece.pieceValue = -1
        emptyPiece.pieceValue = temp
        emptyPiece = piece
      }
    }
  }

  def printBoard(): Unit = {
    for (i <- gameBoard) {
      for (j <- i) {
        if (j != null) {
          print("[ " + j.pieceValue + " ]\t")
        }
      }
      println()
    }
  }

  def randomizeBoard(): Unit = {
    val random: Random = new Random()
    val numMoves: Int = random.nextInt(10000)
    var pieceToMove: Int = 0
    for (i <- 0 to numMoves) {
      pieceToMove = random.nextInt(15)
      println("Piece to move " + pieceToMove)
      movePiece(pieceToMove)
    }
  }
}
