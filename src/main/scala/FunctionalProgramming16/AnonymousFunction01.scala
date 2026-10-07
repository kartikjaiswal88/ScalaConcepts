package FunctionalProgramming16

/*
   1. Anonymous Function:
      A function without a name and without the 'def' keyword.
      Syntax:
      (parameters) => expression

   2. Function Value:
      A function can be assigned to a variable.
      Example:
      val increment: Int => Int = (x: Int) => x + 1

   3. First-Class Function:
      Functions can be treated like values.
      They can be:
      - Assigned to variables
      - Passed as parameters
      - Returned from other functions

   4. Anonymous function with 1 input and 1 output:
      val increment: (Int) => Int = (x: Int) => x + 1
      increment(5) → 6

   5. Anonymous function with 2 inputs and 1 output:
      val add: (Int, Int) => Int = (x: Int, y: Int) => x + y
      add(3, 8) → 11

   6. Zero-parameter function:
      A function with no input can be defined as:
      val printHelloWorld: () => Unit = () => println("Hello World")

      It must be called using:
      printHelloWorld()

   7. Important:
      val printHelloWorld: Unit = println("Hello Duniya")

      This is NOT a function.
      println("Hello Duniya") executes immediately and its
      result (Unit) is stored in printHelloWorld.

      Therefore:
      println(printHelloWorld)
      prints: ()

   8. Difference:
      val x: Unit = println("Hello")
      → Executes immediately.

      val x: () => Unit = () => println("Hello")
      → Stores a function; executes when x() is called.
 */

object AnonymousFunction01 {
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
