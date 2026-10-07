package FunctionalProgramming17

import java.lang.System

/*
 * ================================================================
 *                    FUNCTION CALL BY VALUE
 * ================================================================
 *
 * Interview Definition:
 * Call-by-value is a parameter-passing mechanism in which the
 * argument expression is evaluated first, and the resulting value
 * is then passed to the function.
 *
 * Execution Order:
 *
 * 1. The argument expression is evaluated first.
 *
 * 2. If the argument itself is a function call, that function
 *    executes first.
 *
 * 3. The returned value of that function is obtained.
 *
 * 4. That value is then passed as an argument to the outer
 *    function.
 *
 * Therefore:
 *
 *     inner function → executes first
 *     inner function → produces a value
 *     outer function → receives that value
 *
 * This behavior is called Function Call by Value.
 *
 * Key Point:
 *     In call-by-value, the function receives the evaluated
 *     result/value of the argument expression.
 *
 */

object FunctionByValue01 {

  def main(args: Array[String]): Unit = {
    println("Main function:" + exec(time(), time2()))
  }

  val time: () => Long = () => {
    println("Inside the time function...")
    System.nanoTime
  }

  val time2: () => Long = () => {
  println("Inside the time2 function...")
    System.nanoTime
  }

  def exec(t: Long, t2:Long): Long = {
    println("Inside the execution function...")
    println("Time:" + t)
    println("Time2:" + t2)
    println("Exiting from the execution function...")
    return t
  }
}
