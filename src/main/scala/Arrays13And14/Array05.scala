package Arrays13And14

import Array._

/*
   1. Array.concat:
      Used to combine two or more Arrays into a single Array.
      Example:
      val arr = Array.concat(arr1, arr2)

   2. range:
      Used to create an Array containing a sequence of numbers.
      range(start, end) → end is excluded.
      Example:
      range(1, 50) → 1 to 49

      range(start, end, step) → numbers increase by step.
      Example:
      range(1, 51, 2) → 1, 3, 5, ..., 49

   3. Array of Arrays:
      An Array can contain other Arrays as its elements.
      Example:
      val arrOfArray = Array(arr1, arr2, arr3)

   4. Traversing an Array of Arrays:
      Use nested loops:
      for (arr <- arrOfArray) {
        for (element <- arr)
          print(element + " ")
      }

      Outer loop → accesses each Array.
      Inner loop → accesses elements of each Array.
 */

object Array05 {

  def main(args: Array[String]): Unit = {
    val arr1 = Array(3, 4, 5, 3, 2, 5, 3)
    val arr2 = Array(32, 45, 334, 45, 65)
    val arr3 = Array(3, 6, 8, 86, 34, 45)

    // concat method
    val arr = Array.concat(arr1, arr2)
    arr.foreach(println)

    // range method
    //    val rollNo = range(1, 50)
    val rollNo = range(1, 51, 2)
    rollNo.foreach(print)

    // Array of array
    println()
    val arrOfArray = Array(arr1, arr2, arr3)
    for (arr <- arrOfArray) {
      for (element <- arr)
        print(element + " ")
      println
    }


  }

}
