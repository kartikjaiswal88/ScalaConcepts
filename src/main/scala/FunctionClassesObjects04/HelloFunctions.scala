package FunctionClassesObjects04

object HelloFunctions {
  /*
    Scala does not have static keyword.
    In Scala Object all the methods are static.
    Functions are re-usable piece of code.
    In scala, it is not necessary for return keyword in function.
    In function, if we are specifying the return keyword then it is mandatory to specify the return type of function but not vice-versa
   */

  def main(arg: Array[String]) = {
    val z = sum(7, 6)
    println("Printing the sum of 6 and 7 is:", z)
  }

  def sum(x: Int, y: Int): Int = {
    var z = x + y
    z
  }

  def sumA(x: Int, y: Int) = x + y

}
