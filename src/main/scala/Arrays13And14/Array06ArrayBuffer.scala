package Arrays13And14

import scala.collection.mutable.ArrayBuffer

object Array06ArrayBuffer {
  /*
    1. We can change the lenght of arrayBuffer
   */

  def main(args: Array[String]): Unit = {
    val marks = ArrayBuffer[Int]()
    marks += 3
    marks += 89
    marks += 57

    println("Printing the marks.....")
    marks.foreach(println)

    marks += 78
    marks += 56
    println("Printing the new marks...")
    marks.foreach(println)


    marks ++= Array(45, 87, 34)
    println("Printing marks after appending the array...")
    marks.foreach(println)

    marks -= 45
    println("Printing the marks after removing 45...")
    marks.foreach(println)

  }
}
