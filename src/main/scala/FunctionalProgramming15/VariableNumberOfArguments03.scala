package FunctionalProgramming15

object VariableNumberOfArguments03 {
  /*
     1. String* means array of string
     2. Dynamic length parameters must come at last
     3. We cannot have more than one * means we cannot have variable length parameter more than one.
   */

  def printMultipleTimes(n: Int, args: String*) = {
    for (arg <- args) println(arg * n)
  }

  def main(args: Array[String]): Unit = {
    printMultipleTimes(2, "Kartik", "Jaiswal")
    //    printMultipleTimes("Kartik", "Jaiswal", 2)

  }
}
