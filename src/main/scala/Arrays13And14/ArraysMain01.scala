package Arrays13And14

object ArraysMain01 {
  /*
     1. Array: Array is collection of some data type elements.
     2. Syntax: var num:Array[Int] = new Array[Int](3) or
            var num = new Array[Int](3) or
            var num = new Array(23,55,90)
     3. We cannot change the length of Array
     4. For accessing the elements of scala we always use the () instead of [] like in Java as Scala is pure object Oriented
        language and everything is defined as Object and we are calling the functions.
     5. foreach can gives the multiple outputs, like foreach.marks(println)
     6. foreach can also gives one final output, like foreach.marks(totalMarks += _)
     7. But in case of map, you will always get the multiple output.
     8. Array's length can't be changed after declaration or definition.
   */

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
