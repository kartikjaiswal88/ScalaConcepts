package FunctionalProgramming15

object FunctionProgramming {
  /*
    1. Function: Group of statements for performing specific task
    2. Method: Method is defined inside the class with name, signature, bytecode while function are independent of class.
    3. Function Syntax:
            def functionName(arguments): returnType = {
                function body
                return [variable]
            }

   */

  def sum(x: Int, y: Int): Int = {
    x + y
  }

  def main(args: Array[String]): Unit = {
    println(s"Sum of 5 and 6 is:${sum(5, 6)}")
  }

}
