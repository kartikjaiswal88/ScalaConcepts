package Arrays13And14

import scala.collection.mutable.ArrayBuffer

/*
   1. ArrayBuffer:
      ArrayBuffer is a mutable collection whose size can be
      changed after creation.
      import scala.collection.mutable.ArrayBuffer

   2. Creating ArrayBuffer:
      val marks = ArrayBuffer[Int]()
      Creates an empty ArrayBuffer of Int.

   3. Adding a single element:
      marks += 3
      Adds 3 to the ArrayBuffer.

   4. Adding multiple elements:
      marks ++= Array(45, 87, 34)
      Adds all elements of the given Array to the ArrayBuffer.

   5. Removing an element:
      marks -= 45
      Removes the element 45 from the ArrayBuffer.

   6. Traversing ArrayBuffer:
      marks.foreach(println)
      Prints each element of the ArrayBuffer.

   7. Main difference:
      Array       → Fixed size, mutable elements.
      ArrayBuffer → Dynamic size and mutable elements.
 */

object Array06ArrayBuffer {

  def main(args: Array[String]): Unit = {
    val marks = ArrayBuffer[Int]()
    marks += 3
    marks += 89
    marks += 57

    println("Printing the marks.....")
    marks.foreach(println)

    marks += 78
    marks += 56
    println("Printing the new marks...")
    marks.foreach(println)


    marks ++= Array(45, 87, 34)
    println("Printing marks after appending the array...")
    marks.foreach(println)

    marks -= 45
    println("Printing the marks after removing 45...")
    marks.foreach(println)

  }
}
