package Arrays13And14

import Array._

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
