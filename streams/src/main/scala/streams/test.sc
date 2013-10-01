package streams

object test extends Level1 {
  /**
  terrain(Pos(0, 0))
  terrain(Pos(1, 1))
  Block(Pos(0, 0), Pos(0, 0)).legalNeighbors
  Block(Pos(1, 1), Pos(1, 1)).legalNeighbors
  */
  //pathsFromStart.toList.take(10).mkString("","\n","")(
  //from(Stream((startBlock,List())),Set(startBlock)).toList.take(20).mkString("","\n","")
                                                 //pathsToGoal.toList.take(10)
                                                  solution
                                                  //> res0: List[streams.test.Move] = List(Right, Right, Down, Right, Right, Right
                                                  //| , Down)
 // from(Stream((startBlock, List())),Set(startBloock)).toList

}
trait SolutionChecker extends GameDef with Solver with StringParserTerrain {
  /**
   * This method applies a list of moves `ls` to the block at position
   * `startPos`. This can be used to verify if a certain list of moves
   * is a valid solution, i.e. leads to the goal.
   */
  def solve(ls: List[Move]): Block =
    ls.foldLeft(startBlock) {
      case (block, move) => move match {
        case Left => block.left
        case Right => block.right
        case Up => block.up
        case Down => block.down
      }
    }
}
trait Level1 extends SolutionChecker {
  /* terrain for level 1*/

  val level =
    """ooo-------
      |oSoooo----
      |ooooooooo-
      |-ooooooooo
      |-----ooToo
      |------ooo-""".stripMargin

  val optsolution = List(Right, Right, Down, Right, Right, Right, Down)

}