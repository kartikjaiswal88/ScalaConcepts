package Closures18A

object Clousure02 {

  def main(args: Array[String]): Unit = {
    println(evenOrOdd(isEven, 2))
    println(evenOrOdd(isEven, 3))
    println(evenOrOdd(isEven, 4))
    println(evenOrOdd(isEven, 5))
    println(evenOrOdd(isEven, 6))
  }

  //  def isEven(x: Int): Boolean = {
  //    x % 2 == 0
  //  }

  val div = 2
  val isEven: Int => Boolean = (n: Int) => n % div == 0
  
  def evenOrOdd(f: Int => Boolean, n: Int): String = {
    if (f(n)) "Even Number"
    else "Odd Number"
  }
}
