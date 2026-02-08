package TuplesOptionsAndIterators23

case class Student(rollNo: Int, firstName: String, lastName: String)

object Tuples01 {

  /*
    1. Tuples: Fixed number of elements (1 to 22)
    2. Tuples are immutable
    3. If you initialized tuple of 3 elements, then you cannot assign 5 elemets later
    4. Tuples not much used, instead of tuples people prefer case class.
   */

  def main(args: Array[String]): Unit = {
    val tupleOfThree = (1, "String Data", 2.3)
    println(s"Tuple of 3 elements:$tupleOfThree and class:${tupleOfThree.getClass}")

    var tupleOfFive = new Tuple5(2, "Kartik", 3.4, 3.44, true)
    println(s"Tuple of 3 elements:$tupleOfFive and class:${tupleOfFive.getClass}")

    //    tupleOfFive = (5, "Jaiswal", 5.4) // We cannot assign 3 elements of 5 elements tuple

    // Accessing elements of Tuple
    println(s"First element of tupleOfThree:${tupleOfThree._1}")
    println(s"Second element of tupleOfThree:${tupleOfThree._2}")
    println(s"Third element of tupleOfThree:${tupleOfThree._3}")

    // Accessing elements of Tuple using productIterator method
    tupleOfThree.productIterator.foreach(i => println(s"Value is:$i"))

    // Converting tuple into string using toString element
    val tupleOfTwo = (1, "One")
    println(s"Converting elements of tupleOfTwo into string:${tupleOfTwo.toString()}")

    // Swap: Tuple2 have special method to swap the position of elements
    println(s"Swaping elements of tupleOfTwo:${tupleOfTwo.swap}")

    // List of Tuples
    val listOfCarTuples = List(("Mercedes", "High Range"), ("Suzuki", "Mid Range"), ("Jaguar", "Hight Range"))
    listOfCarTuples.foreach {
      case ("Jaguar", range) => println(s"Car is Jaguar and range is:$range")
      case _ =>
    }

    // Tuples not much used, instead of tuples people prefer case class.
    val student = Student(1, "Kartik", "Jaiswal")
    println(s"Printing the student where I clearly know meaning of each values unlike tuple:$student")

  }

}
