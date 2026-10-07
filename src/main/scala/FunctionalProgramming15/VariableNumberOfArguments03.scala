package FunctionalProgramming15

object VariableNumberOfArguments03 {
  /*
   1. Variable-Length Arguments:
      String* is a repeated parameter that allows us to pass
      zero or more String values to a method.
      Inside the method, it can be treated as a sequence of values.

   2. The variable-length parameter must be the last parameter.
      Example:
      def printMultipleTimes(n: Int, args: String*)

   3. A method can have only one variable-length parameter.

   4. Example:
      printMultipleTimes(2, "Kartik", "Jaiswal")

      n    → 2
      args → "Kartik", "Jaiswal"

   5. The * parameter can accept any number of arguments:
      printMultipleTimes(2)
      printMultipleTimes(2, "Kartik")
      printMultipleTimes(2, "Kartik", "Jaiswal", "Scala")

   6. Variable-length arguments are useful when the number of
      arguments is not known in advance.
 */

  def printMultipleTimes(n: Int, args: String*) = {
    for (arg <- args) println(arg * n)
  }

  def main(args: Array[String]): Unit = {
    printMultipleTimes(2, "Kartik", "Jaiswal")
    //    printMultipleTimes("Kartik", "Jaiswal", 2)

  }
}
