package ConditionalStatementsAndLoops09B

import scala.util.control.Breaks.{break, breakable}

object ForLoop03 {

  def main(args: Array[String]): Unit = {
    // It will execute for i from 1 to 10
    for (i <- 1 to 10) {
      println(s"Value of i is:${i}")
    }

    // It will execute for i from 1 to 9
    for (i <- 1 until 10)
      println(s"Value of i using until is:${i}")

    // Nested for loop
    for (i <- 1 to 10)
      for (j <- 1 to 10)
        println(s"Value of i is:${i} and Value of j is:$j")

    // Nested for loop in Scala
    for (i <- 1 to 2; j <- 1 to 2; k <- 1 to 2)
      println(s"Value of i is:${i} and Value of j is:$j and Value of k is:$k")

    /* List - Similar to Arrays.
       List is immutable i.e you can not change the content of list once it is defined
      */
    val numList = List(1, 2, 3, 4, 5)
    for (i <- numList)
      println(s"Value of i is:${i}")


    println("==========================For Loop for Collections with filter=======================")

    val numLst = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i <- numLst if i % 2 == 0; if i != 4)
      println(s"Value of i is:${i}")

    // For loop with yield
    val evenList = for (i <- numList if i % 2 == 0) yield i
    println("Even number list:")
    println(evenList)


    // Break Statement
    val numLstBreak = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    breakable {
      for (i <- numLst if i % 2 == 0) {
        println(s"Value of i is:${i}")
        if (i == 4) {
          println("I am breaking the loop.....")
          break
        }
      }
    }
  }
}










