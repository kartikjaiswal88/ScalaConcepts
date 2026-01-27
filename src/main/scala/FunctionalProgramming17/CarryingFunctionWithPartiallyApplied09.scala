package FunctionalProgramming17

object CarryingFunctionWithPartiallyApplied09 {

  /*
    1. Function chaining = function carrying (separate parameters in different brackets) + partially applied function
   */

  def add(a: Int)(b: Int): Int = a + b

  def main(args: Array[String]): Unit = {
    val sum = add(29) _; // Partially applied function
    println(sum(2));
  }

}
