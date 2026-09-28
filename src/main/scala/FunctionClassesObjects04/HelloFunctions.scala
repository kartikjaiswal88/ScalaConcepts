package FunctionClassesObjects04

object HelloFunctions {
  /*
   1. Scala does not have static keyword.
   2. Scala does not have the static keyword.
      Methods defined inside a Scala object belong to that singleton object and can be accessed
      through the object name, providing functionality similar to many uses of Java's static members.
   3. Functions are re-usable piece of code.
   4. In scala, it is not necessary for return keyword in function.
   5. In function, if we are specifying the return keyword then it is mandatory to specify the return type of function but not vice-versa
   6. A singleton object in Scala is an object for which only one instance exists within the application,
      created using the object keyword rather than new.
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
