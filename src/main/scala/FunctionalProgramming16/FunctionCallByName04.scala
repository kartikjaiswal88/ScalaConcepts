package FunctionalProgramming16

object FunctionCallByName04 {
  /*
     1. We can pass the function as parameter
   */

  def main(args: Array[String]): Unit = {
    printIncrementValue(increment())
    printIncrementValue(decrement())
  }

  def printIncrementValue(func: => Int): Unit = {
    println(s"Changed value is:${func}")
  }

  def increment(): Int = {
    val x = 3
    println(s"Printing the value of x:${x}")
    val y = x + 1
    println(s"Printing the value of y:$y")
    y
  }

  def decrement(): Int = {
    val x = 3
    println(s"Printing the value of x:${x}")
    val y = x - 1
    println(s"Printing the value of y:$y")
    y
  }
}
