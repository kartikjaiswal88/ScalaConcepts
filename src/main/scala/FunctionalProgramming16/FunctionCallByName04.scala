package FunctionalProgramming16

object FunctionCallByName04 {
  /*
   1. Call-by-Name:
      A call-by-name parameter is evaluated only when it is used
      inside the method.
      Syntax:
      def method(func: => Type)

   2. In:
      def printIncrementValue(func: => Int)

      func is an Int expression that is passed to the method,
      but it is not evaluated before entering the method.

   3. When:
      printIncrementValue(increment())

      increment() is passed to printIncrementValue without being
      evaluated immediately.

   4. When func is used:
      println(s"Changed value is:${func}")

      increment() is evaluated at that point.

   5. Call-by-Name does not mean passing a function itself.
      It means passing an expression whose evaluation is delayed.

   6. Call-by-Value:
      def method(x: Int)
      The argument is evaluated before entering the method.

   7. Call-by-Name:
      def method(x: => Int)
      The argument is evaluated when it is used inside the method.

   8. Example:
      printIncrementValue(increment())
      printIncrementValue(decrement())

      increment() returns 4, so output is:
      Changed value is:4

      decrement() returns 2, so output is:
      Changed value is:2
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
