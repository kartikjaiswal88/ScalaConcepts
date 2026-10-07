package Closures18A

/*
 * Closure with Higher-Order Function:
 *
 * Interview Definition:
 * A closure is a function that captures and uses a variable from
 * its surrounding lexical scope. A higher-order function is a
 * function that takes another function as a parameter, returns a
 * function, or both.
 *
 * In this program:
 * 1. `div` is defined outside the `isEven` function.
 * 2. `isEven` uses `div`, so it captures `div` and becomes a closure.
 * 3. `evenOrOdd` accepts a function as its first parameter.
 * 4. Therefore, `evenOrOdd` is a higher-order function.
 * 5. `isEven` is passed to `evenOrOdd` as a function value.
 * 6. `evenOrOdd` calls the received function using `f(n)`.
 *
 * Execution:
 *   isEven(2) → 2 % div == 0 → true → Even Number
 *   isEven(3) → 3 % div == 0 → false → Odd Number
 *
 * Important:
 * `div` is not a parameter of `isEven`, but `isEven` can still
 * access it because it is captured from the surrounding scope.
 *
 * Function Type:
 *   `Int => Boolean`
 *
 * means:
 *   Takes an Int as input and returns a Boolean.
 *
 * Key Point:
 * This example demonstrates that a closure can be passed as a
 * function value to another function.
 */

object Clousure02 {

  def main(args: Array[String]): Unit = {
    println(evenOrOdd(isEven, 2))
    println(evenOrOdd(isEven, 3))
    println(evenOrOdd(isEven, 4))
    println(evenOrOdd(isEven, 5))
    println(evenOrOdd(isEven, 6))
  }

  //  def isEven(x: Int): Boolean = {
  //    x % 2 == 0
  //  }

  val div = 2
  val isEven: Int => Boolean = (n: Int) => n % div == 0
  
  def evenOrOdd(f: Int => Boolean, n: Int): String = {
    if (f(n)) "Even Number"
    else "Odd Number"
  }
}
