package FunctionalProgramming17

import scala.annotation.tailrec

object NestedFunction07 {
  def main(args: Array[String]): Unit = {
    println(factorial(5))

    def factorial(i: Int): Int = {
      @tailrec
      def fact(x: Int, prevResult: Int): Int = {
        if (x <= 1) prevResult
        else fact(x - 1, x * prevResult)
      }

      val z = fact(i, 1)
      z
    }
  }
}
