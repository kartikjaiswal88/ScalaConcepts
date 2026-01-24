package FunctionalProgramming15

object FunctionsWithNamedArguments02 {

  def sum(x: Int, y: Int): Int = {
    println(s"Value of x is:${x}")
    println(s"Value of x is:${y}")
    x + y
  }

  def main(args: Array[String]): Unit = {
    println(s"Sum of 5 and 6 is:${sum(5, 6)}")
    println(s"Sum of 5 and 6 is:${sum(y = 5, x = 6)}")
  }


}
