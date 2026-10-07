package ConditionalStatementsAndLoops09B

import scala.util.control.Breaks.{break, breakable}

/*
 * ================================================================
 *                         FOR LOOP
 * ================================================================
 *
 * Interview Definition:
 * A `for` expression in Scala is used to iterate over ranges,
 * collections and other iterable data. Unlike traditional Java-style
 * for loops, Scala's `for` is an expression and can also produce
 * values using `yield`.
 *
 *
 * ================================================================
 * 1. FOR LOOP WITH RANGE
 * ================================================================
 *
 * Scala provides `to` and `until` for creating ranges.
 *
 * `to`
 *     Creates an inclusive range.
 *     The ending value is included.
 *
 * `until`
 *     Creates an exclusive range.
 *     The ending value is not included.
 *
 * Example concept:
 *
 *     1 to 10   → 1 through 10
 *     1 until 10 → 1 through 9
 *
 *
 * ================================================================
 * 2. NESTED FOR LOOP
 * ================================================================
 *
 * A `for` loop can be placed inside another `for` loop.
 *
 * For every iteration of the outer loop, the complete inner loop
 * is executed.
 *
 * If the outer loop has N iterations and the inner loop has M
 * iterations, the loop body executes N × M times.
 *
 *
 * ================================================================
 * 3. MULTIPLE GENERATORS
 * ================================================================
 *
 * Multiple generators can be written in the same `for` expression.
 *
 * Each generator depends on the previous generators and produces
 * combinations of their values.
 *
 * This provides a concise way of writing nested loops.
 *
 *
 * ================================================================
 * 4. FOR LOOP WITH COLLECTIONS
 * ================================================================
 *
 * A `for` expression can iterate directly over collections such
 * as List, Vector, Set and other Iterable types.
 *
 * The variable receives each element of the collection one by one.
 *
 *
 * ================================================================
 * 5. GUARD / FILTER
 * ================================================================
 *
 * Interview Definition:
 * A guard is an `if` condition inside a `for` expression that
 * filters the elements before the loop body is executed.
 *
 * Multiple guards can be used.
 *
 * Only elements satisfying all applicable conditions are processed.
 *
 * Example concept:
 *
 *     Even numbers AND number is not 4
 *
 *
 * ================================================================
 * 6. FOR LOOP WITH YIELD
 * ================================================================
 *
 * Interview Definition:
 * `yield` transforms a `for` expression into a value-producing
 * expression by collecting the result of every iteration into a
 * new collection.
 *
 * Without `yield`:
 *
 *     The loop is mainly used for performing side effects such as
 *     printing or updating something.
 *
 * With `yield`:
 *
 *     The loop produces a collection containing the generated
 *     results.
 *
 * Important:
 *
 * `yield` does not modify the original collection.
 *
 *
 * ================================================================
 * 7. BREAK IN SCALA
 * ================================================================
 *
 * Scala does not provide a normal built-in `break` keyword like
 * Java.
 *
 * Scala provides break-like functionality through:
 *
 *     scala.util.control.Breaks
 *
 * Important components:
 *
 * `breakable`
 *     Defines the scope from which `break` can exit.
 *
 * `break`
 *     Immediately exits the nearest enclosing `breakable` block.
 *
 *
 * Execution:
 *
 *     Loop starts
 *          ↓
 *     Condition checked
 *          ↓
 *     Loop body executes
 *          ↓
 *     break condition?
 *       /        \
 *     No          Yes
 *     ↓            ↓
 *   Continue      break
 *     ↓            ↓
 *   Next          Exit loop
 *
 *
 * ================================================================
 * 8. IMPORTANT NOTE ABOUT BREAK
 * ================================================================
 *
 * Although `Breaks` provides break-like behavior, using `break`
 * is generally less idiomatic in Scala.
 *
 * Depending on the problem, Scala's collection methods or other
 * control-flow constructs can often express the same logic more
 * clearly.
 *
 *
 * ================================================================
 * 9. FOR EXPRESSION
 * ================================================================
 *
 * One of the important differences between Scala and Java is that
 * `for` is an expression in Scala.
 *
 * Therefore, a `for` expression can produce a result.
 *
 * `yield` is commonly used when the result of every iteration needs
 * to be collected.
 *
 *
 * ================================================================
 * KEY INTERVIEW POINTS
 * ================================================================
 *
 * 1. `to` creates an inclusive range.
 *
 * 2. `until` creates an exclusive range.
 *
 * 3. Scala `for` can iterate over ranges and collections.
 *
 * 4. Nested `for` loops can be represented using multiple
 *    generators.
 *
 * 5. An `if` condition inside a `for` is called a guard.
 *
 * 6. Multiple guards can be used to filter elements.
 *
 * 7. `yield` makes a `for` expression produce a collection.
 *
 * 8. `yield` does not modify the original collection.
 *
 * 9. Scala does not have a normal built-in `break` keyword.
 *
 * 10. `Breaks.break` and `breakable` provide break-like behavior.
 *
 * 11. `for` is an expression in Scala, meaning it can produce
 *     a value.
 *
 * 12. Scala `for` expressions are closely related to collection
 *     operations such as `map`, `flatMap` and `withFilter`.
 *
 */

object ForLoop03 {

  def main(args: Array[String]): Unit = {
    // It will execute for i from 1 to 10
    for (i <- 1 to 10) {
      println(s"Value of i is:${i}")
    }

    // It will execute for i from 1 to 9
    for (i <- 1 until 10)
      println(s"Value of i using until is:${i}")

    // Nested for loop
    for (i <- 1 to 10)
      for (j <- 1 to 10)
        println(s"Value of i is:${i} and Value of j is:$j")

    // Nested for loop in Scala
    for (i <- 1 to 2; j <- 1 to 2; k <- 1 to 2)
      println(s"Value of i is:${i} and Value of j is:$j and Value of k is:$k")

    /* List - Similar to Arrays.
       List is immutable i.e you can not change the content of list once it is defined
      */
    val numList = List(1, 2, 3, 4, 5)
    for (i <- numList)
      println(s"Value of i is:${i}")


    println("==========================For Loop for Collections with filter=======================")

    val numLst = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    for (i <- numLst if i % 2 == 0; if i != 4)
      println(s"Value of i is:${i}")

    // For loop with yield
    val evenList = for (i <- numList if i % 2 == 0) yield i
    println("Even number list:")
    println(evenList)


    // Break Statement
    val numLstBreak = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    breakable {
      for (i <- numLst if i % 2 == 0) {
        println(s"Value of i is:${i}")
        if (i == 4) {
          println("I am breaking the loop.....")
          break
        }
      }
    }
  }
}










