package main.game

import main.game.model.Board

object Main {
  def main(args: Array[String]): Unit ={
    var gameBoard : Board = new Board()
    gameBoard.randomizeBoard()
    gameBoard.printBoard()
  }
}
