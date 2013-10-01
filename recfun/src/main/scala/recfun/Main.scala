package recfun
import common._

object Main {
  def main(args: Array[String]) {
    println("Pascal's Triangle")
    for (row <- 0 to 10) {
      for (col <- 0 to row)
        print(pascal(col, row) + " ")
      println()
    }
  }

  /**
   * Exercise 1
   */
  def pascal(c: Int, r: Int): Int = {
    if (c == 0 || r == 0 || c == r) 1
    else {
      // to loop through rows
      def loop(rowVals: Array[Int], currentRow: Int): Int = {
        if (r - 1 == currentRow) rowVals(c - 1) + rowVals(c)
        else {
          val line = 1 +: computeLine(rowVals)
          loop(line, currentRow + 1);
        }

      }
      // compute values for next line
      def computeLine(line: Array[Int]): Array[Int] = {
        if (line.length > 1) (line.head + line.tail.head) +: computeLine(line.tail)
        else Array(1)
      }

      loop(Array(1, 1), 1);
    }

  }

  /**
   * Exercise 2
   */
  def balance(chars: List[Char]): Boolean = {

    def loop(charsLeft: List[Char], braceCounter: Int): Boolean = {
      if (charsLeft.isEmpty) {
        braceCounter == 0
      } else {
        if (braceCounter < 0) false
        else loop(charsLeft.tail, checkCharForBraces(charsLeft.head, braceCounter))
      }
    }

    def checkCharForBraces(c: Char, cnt: Int): Int = {
      if (c == '(') cnt + 1
      else if (c == ')') cnt - 1
      else cnt
    }

    loop(chars, 0);

  }

  /**
   * Exercise 3
   */
  def countChange(money: Int, coins: List[Int]): Int = {

    def combinations(coins: List[Int], change: Int): Int = {
      //  println("called with " + coins + " " + change);
      if (change == 0) {
        //  println("return 1")
        1
      } else if ((change < 0) || (coins.isEmpty)) {

        //println("return 0")
        0
      } else {
        // println("calling (" + coins.tail + "," + change + ") + combinations(" + coins + "," + (change - coins.head) + ")")

        combinations(coins.tail, change) + combinations(coins, change - coins.head)

      }
    }
    combinations(coins, money)

  }
}
