package FunctionalProgramming15

import scala.io.StdIn.readInt

object DefaultParameters05 {
  def sum(x: Int = 10, y: Int = 20) = {
    println(s"Value of x is:${x}")
    println(s"Value of y is:${y}")

    println(s"Sum of x and y is:${x + y}")
  }

  def main(args: Array[String]): Unit = {

    var a, b = 0
    println("Enter 2 numbers:")
    a = readInt()
    b = readInt()
    sum(a, b)

    sum(3, 5)
    sum(2)
    sum(y = 7)

  }
}
