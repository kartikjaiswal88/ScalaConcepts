package Closures18A

object Closures01 {
  /*
    1. Closure: Variables are defined outside the function definition.
    2. If any variable(factor) which is defined outside the function body is called as Closure
   */


  def main(args: Array[String]): Unit = {
    println(multiplier(5))
  }

  //  def multiplier(n: Int): Int = n * 10

  val factor = 10
  val multiplier: Int => (Int) = (n: Int) => n * factor


  // Below function is not closure because, all it's variables are defined inside the function
  def multiplier1(n: Int): Int = {
    val factor = 12
    n * factor
  }
}
