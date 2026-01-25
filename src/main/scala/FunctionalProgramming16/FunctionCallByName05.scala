package FunctionalProgramming16

object FunctionCallByName05 {
  /*
     1. We can pass the function as parameter
     2. If we need to pass the argument of passing function then we have pass it separately.
   */

  def main(args: Array[String]): Unit = {
    printIncrementValue(increment, 2)
    printIncrementValue(decrement, 2)
  }

  def printIncrementValue(func: (Int) => Int, x: Int): Unit = {
    println(s"Changed value is:${func(x)}")
  }

  def increment(x: Int): Int = {
    println(s"Printing the value of x:${x}")
    val y = x + 1
    println(s"Printing the value of y:$y")
    y
  }

  def decrement(x: Int): Int = {
    println(s"Printing the value of x:${x}")
    val y = x - 1
    println(s"Printing the value of y:$y")
    y
  }
}
