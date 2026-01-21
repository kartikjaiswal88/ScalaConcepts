package Arrays13And14

import Array._

object Array04 {
  /*

   */

  def main(args: Array[String]): Unit = {
    val matrixEg = ofDim[Int](3, 3)

    for (row <- 0 to 2) {
      for (column <- 0 to 2) {
        matrixEg(row)(column) = row + column
        print(matrixEg(row)(column) + " ")
      }
      println()
    }

    println()

    for (row <- 0 to 2) {
      for (column <- 0 to 2) {
        if (row == column)
          matrixEg(row)(column) = 1
        else
          matrixEg(row)(column) = 0
        print(matrixEg(row)(column) + " ")
      }
      println()
    }


  }
}
