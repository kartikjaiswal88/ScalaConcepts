package FunctionalProgramming15

object RecursiveFunction04 {
  def factorial(n: Int): Int = {
    if (n == 0 || n == 1) return 1
    else n * factorial(n - 1)
  }


  def main(args: Array[String]): Unit = {

    println(s"Factorial of 4 is:${factorial(4)}")
    println(s"Factorial of 2 is:${factorial(2)}")
  }
}
