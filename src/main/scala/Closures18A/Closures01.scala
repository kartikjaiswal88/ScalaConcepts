package Closures18A

/*
 * Closure:
 *
 * Interview Definition:
 * A closure is a function that captures and uses variables from its
 * surrounding lexical scope, even when those variables are defined
 * outside the function itself.
 *
 * In this program:
 * 1. `factor` is defined outside the function body.
 * 2. `multiplier` uses `factor`.
 * 3. Therefore, `multiplier` captures `factor` from its surrounding
 *    scope and becomes a closure.
 *
 * Important:
 * A closure is not simply a function with an external variable.
 * The important concept is that the function captures the variable
 * from its surrounding scope.
 *
 * `multiplier`:
 *   - `n` is a local parameter.
 *   - `factor` comes from the surrounding scope.
 *   - Since `factor` is captured, `multiplier` is a closure.
 *
 * `multiplier1`:
 *   - `n` is a parameter.
 *   - `factor` is defined inside the function.
 *   - It does not capture any variable from an outer scope.
 *   - Therefore, it is not a closure in this example.
 *
 * Key Point:
 * A closure combines a function with access to variables captured
 * from its surrounding lexical environment.
 *
 * Important Note:
 * The captured variable can be mutable or immutable. If a mutable
 * variable is captured, changes to that variable can be observed
 * by the closure.
 */

object Closures01 {

  def main(args: Array[String]): Unit = {
    println(multiplier(5))
  }

  //  def multiplier(n: Int): Int = n * 10

  val factor = 10
  val multiplier: Int => (Int) = (n: Int) => n * factor


  // Below function is not closure because, all it's variables are defined inside the function
  def multiplier1(n: Int): Int = {
    val factor = 12
    n * factor
  }
}
