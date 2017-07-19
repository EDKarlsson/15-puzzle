package main.solver

import main.game.model.{Board, Piece}

import scala.collection.mutable

/**
  * This method one on how to solve the 15 puzzle. Most likely will be brute force.
  */
class Solver(board: Board) {
  var queue = new mutable.Queue[Piece]


  def solve(board: Board): Unit = {
    var start = board.gameBoard
    var goal = board.solution

  }

  def calculate_heuristic(start: Board, goal: Board): Unit = {

  }

  def reconstruct_path(cameFrom: Unit, current: Unit): Unit = {

  }
}
