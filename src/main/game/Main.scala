package main.game

import main.game.model.Board
import main.solver.Solver

object Main {
  def main(args: Array[String]): Unit ={
    val gameBoard : Board = new Board()
    gameBoard.randomizeBoard()
    gameBoard.printBoard()
    val solver: Solver = new Solver(gameBoard)
    solver.solve(gameBoard)
  }
}
