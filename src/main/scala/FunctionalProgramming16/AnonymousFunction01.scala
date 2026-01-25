package FunctionalProgramming16

object AnonymousFunction01 {
  /*
      1. Anonymous Function: Function without name and def keyword.
      2. First Class Function: Pass function as parameter and define function values.
   */

  def main(args: Array[String]): Unit = {
    println("Increment function output is:" + increment(5))
    //    println(printHelloWorld())

    println(printHelloWorld)

    println(s"Add function returns:${add(3, 8)}")
  }

  // Anonymous function with 1 input parameter and 1 output parameter
  // Traditional way of defining the function
  //  def increment(x: Int): Int = {
  //    x + 1
  //  }

  // Using function value or Anonymous function
  var increment: (Int) => Int = (x: Int) => x + 1


  // Anonymous function with 0 input parameter and 0 output parameter
  //  def printHelloWorld()={
  //    println("Hello World...")
  //  }

  val printHelloWorld: Unit = println("Hello Duniya")


  // Anonymous function with 2 input parameters and 1 output parameters
  //  def add(x: Int, y: Int): Int = {
  //    x + y
  //  }

  val add: (Int, Int) => Int = (x: Int, y: Int) => x + y


}
