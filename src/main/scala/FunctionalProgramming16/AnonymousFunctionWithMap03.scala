package FunctionalProgramming16

object AnonymousFunctionWithMap03 {

  def main(args: Array[String]): Unit = {
    val numbers = List(4, 22, 66, 3, 76, 44, 78, 45, 88, 12, 32)
    //    val squareOfNumbers = numbers.map(square)

    val squareOfNumbers = numbers.map(x => x * x)
    //    val squareOfNumbers = numbers.map(_ * _) // This will not work, because it expects 2 inputs but map provide only one.

    println("Printin the square of numbers...")
    println(squareOfNumbers)
  }

  // Traditional way
  //  def square(x: Int): Int = {
  //    x * x
  //  }

  val square = (x: Int) => x * x
  //  val square:Int =>Int  = (x: Int) => x * x

}
