package FunctionalProgramming16

/*
   1. filter:
      filter is used to select elements from a collection based
      on a condition.
      It returns a new collection containing only the elements
      for which the condition is true.

   2. filter with a normal anonymous function:
      numbers.filter((x: Int) => x % 3 == 0)

   3. Type inference:
      The type of x can be omitted because Scala can infer it:
      numbers.filter(x => x % 3 == 0)

   4. Placeholder syntax:
      numbers.filter(_ % 3 == 0)

      '_' represents each element of the collection.
      This is a shorter form of:
      numbers.filter(x => x % 3 == 0)

   5. filter vs foreach:
      foreach → performs an action on every element and returns Unit.
      filter  → selects elements and returns a new collection.

   6. for-yield:
      val output = for (num <- numbers if divisibleByThree(num))
                    yield num

      The 'if' acts as a filter and 'yield' creates a new collection.

   7. Function value:
      val divisibleByThree: Int => Boolean =
        (n: Int) => n % 3 == 0

      It takes an Int as input and returns Boolean.

   8. The following are equivalent:
      numbers.filter((x: Int) => x % 3 == 0)
      numbers.filter(x => x % 3 == 0)
      numbers.filter(_ % 3 == 0)

   9. For the given numbers, the output is:
      List(66, 3, 76, 78, 45, 12)
 */

object AnonymousFunctionWithFilter02 {

  def main(args: Array[String]): Unit = {
    val numbers = List(4, 22, 66, 3, 76, 44, 78, 45, 88, 12, 32)
    //    val outputOfDivisibleByThree = numbers.foreach(num => if (divisibleByThree(num)) println(s"$num is divisible by 3"))
    val outputOfDivisibleByThree = for (num <- numbers if (divisibleByThree(num))) yield num

    println("Printing the numbers which are divisible by 3")
    println(outputOfDivisibleByThree)

    //Anonymous function with Filter
    //    val divisibleByThreeOutput = numbers.filter((x: Int) => x % 3 == 0)
    //    val divisibleByThreeOutput = numbers.filter(x => x % 3 == 0)
    val divisibleByThreeOutput = numbers.filter(_ % 3 == 0)
    println("Divisible by three Output...")
    println(divisibleByThreeOutput)

  }

  //  def divisibleByThree(n: Int) = {
  //    n % 3 == 0
  //  }

  val divisibleByThree: Int => Boolean = (n: Int) => n % 3 == 0
}
