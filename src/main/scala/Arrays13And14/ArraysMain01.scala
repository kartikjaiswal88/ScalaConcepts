package Arrays13And14

/*
   1. Array:
      Array is a collection of elements of the same type.
      Arrays are mutable, meaning their elements can be changed.

   2. Syntax:
      var num: Array[Int] = new Array[Int](3)
      or
      var num = new Array[Int](3)
      or
      var num = Array(23, 55, 90)

   3. The length/size of an Array cannot be changed after it
      has been created.
      However, the values of its elements can be changed.

   4. Array elements are accessed using () in Scala:
      num(0)
      num(1)
      instead of [] as commonly used in Java.
      In Scala, num(0) is actually a method call:
      num.apply(0)
      Similarly:
      num(0) = 10
      internally corresponds to:
      num.update(0, 10)

   5. foreach is used to perform an operation on every element.
      It returns Unit.
      Example:
      num.foreach(println)
      It produces multiple printed outputs, but the return
      value of foreach is Unit.

   6. foreach can also be used to update an external variable:
      var totalMarks = 0
      marks.foreach(mark => totalMarks += mark)
      Here totalMarks contains the final accumulated value,
      but foreach itself still returns Unit.

   7. map is used to transform every element and returns a
      new collection.
      Example:
      val marks = Array(10, 20, 30)
      val updatedMarks = marks.map(mark => mark + 1)
      updatedMarks:
      Array(11, 21, 31)

   8. Array's length cannot be changed after creation, but its
      elements can be modified because Array is mutable.
      Example:
      val marks = Array(10, 20, 30)
      marks(0) = 50
      Result:
      Array(50, 20, 30)
 */

object ArraysMain01 {

  def main(args: Array[String]): Unit = {
    var marks = Array(32, 34, 33)
    println(s"Third element of array is:${marks(2)}")

    println("Printing all the marks:")
    for (mark <- marks) println(mark)

    var totalMarks, averageMarks = 0
    for (mark <- marks) totalMarks += mark

    //    for(i <- 0 until marks.length) totalMarks += marks(i)

    println(s"Total marks are:$totalMarks")

    averageMarks = totalMarks / marks.length
    println(s"Average Marks are:$averageMarks")

  }

}
