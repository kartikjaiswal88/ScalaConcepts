package Arrays13And14

import Array._

/*
   1. Creating a 2D Array:
      val matrixEg = ofDim[Int](3, 3)
      Creates a 3 × 3 two-dimensional Array of Int.
      Initially, all elements contain the default Int value 0.

   2. Accessing elements:
      matrixEg(row)(column)
      Example: matrixEg(1)(2)
      1 → row index, 2 → column index.

   3. Updating elements:
      matrixEg(row)(column) = value
      Example: matrixEg(1)(2) = 5

   4. Nested loops:
      Outer loop iterates through rows and inner loop iterates
      through columns.
      for (row <- 0 to 2) {
        for (column <- 0 to 2) { ... }
      }

   5. Generating matrix values:
      matrixEg(row)(column) = row + column
      Result:
      0 1 2
      1 2 3
      2 3 4

   6. Creating an identity matrix:
      if (row == column)
        matrixEg(row)(column) = 1
      else
        matrixEg(row)(column) = 0
      Result:
      1 0 0
      0 1 0
      0 0 1

   7. Matrix indexes start from 0.
      For a 3 × 3 matrix:
      Rows    → 0, 1, 2
      Columns → 0, 1, 2

   8. ofDim:
      ofDim[Int](3, 3) creates a multidimensional Array.
      It can also be written as:
      Array.ofDim[Int](3, 3)
 */

object Array04 {

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
