package Arrays13And14

object Array03 {

  /*
    reduceLeft: Take first two elements of array from left and do some operation and
                then take result and do operation with third element
    reduceRight: Take first two elements of array from left and do some operation and
                 then take result and do operation with third element
   */

  def main(args: Array[String]): Unit = {
    var marks = Array(2, 3, 5, 6, 7, 5, 4, 2, 5, 9, 23, 34, 66, 54, 75)

    // reduceLeft
    val avg = marks.reduceLeft((x, y) => {
      println(s"Value of x is:$x and value of y is:$y")
      (x + y) / 2
    }
    )
    println(avg)

    val avg1 = marks.reduceLeft(_/2+_/2)
    println(avg1)


    val totalMarks = marks.reduceLeft(_ + _) // marks.sum
    println(s"Total Marks is:$totalMarks")

    val maxMarks = marks.reduceLeft(_ max _) // marks.max
    println(s"Maximum marks is:$maxMarks")

    val minMarks = marks.reduceLeft(_ min _) // marks.max
    println(s"Maximum marks is:$minMarks")


    // reduceRight: we can do same above things using reduceRight
    val avg2 = marks.reduceRight(_ / 2 + _ / 2)
    println(avg2)


  }

}
