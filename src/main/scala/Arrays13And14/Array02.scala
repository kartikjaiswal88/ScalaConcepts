package Arrays13And14

object Array02 {
  /*
    1. foreach can gives the multiple outputs, like foreach.marks(println)
    2. foreach can also gives one final output, like foreach.marks(totalMarks += _)
    3. But in case of map, you will always get the multiple output.
    4. If you want to do same operations on each element of an Array ------> Use Map(it knows we have to operate on each
       element, so it starts operating in parallel while foreach will execute one by one.)
    5. If you want to take the single output then use the foreach, like marks.foreach(totalMarks += _)
    6. Map will always returns the new array and if you want to return new array in case of for loop then use yield
   */
  def main(args: Array[String]): Unit = {
    val marks = Array(3, 6, 3, 4, 65, 33, 88, 34, 64, 76, 90)

    // 1. Using for loop
    for (mark <- marks) println(mark) // Accessing each elements of Array

    // 2. Using foreach
    marks.foreach(println)


    // Calculating average marks using foreach loop
    var totalMarks = 0
    //    marks.foreach(mark => totalMarks = totalMarks + mark)
    //    marks.foreach(mark => totalMarks += mark)
    marks.foreach(totalMarks += _)
    println(s"Average marks is:${totalMarks / marks.length}")


    // map
    //    val newMarks = marks.map(mark=> mark + 10)
    val newMarks = marks.map(_ + 10)
    newMarks.foreach(println)

    // for with yield
    val result = for (mark <- marks) yield (mark + 10)
    result.foreach(println)


  }
}
