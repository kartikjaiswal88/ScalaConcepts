package FunctionalProgramming16

object AnonymousFunctionWithFilter02 {

  def main(args: Array[String]): Unit = {
    val numbers = List(4, 22, 66, 3, 76, 44, 78, 45, 88, 12, 32)
    //    val outputOfDivisibleByThree = numbers.foreach(num => if (divisibleByThree(num)) println(s"$num is divisible by 3"))
    val outputOfDivisibleByThree = for (num <- numbers if (divisibleByThree(num))) yield num

    println("Printing the numbers which are divisible by 3")
    println(outputOfDivisibleByThree)

    //Anonymous function with Filter
    //    val divisibleByThreeOutput = numbers.filter((x: Int) => x % 3 == 0)
    //    val divisibleByThreeOutput = numbers.filter(x => x % 3 == 0)
    val divisibleByThreeOutput = numbers.filter(_ % 3 == 0)
    println("Divisible by three Output...")
    println(divisibleByThreeOutput)

  }

  //  def divisibleByThree(n: Int) = {
  //    n % 3 == 0
  //  }

  val divisibleByThree: Int => Boolean = (n: Int) => n % 3 == 0
}
