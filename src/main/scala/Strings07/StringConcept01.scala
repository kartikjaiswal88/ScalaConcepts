package Strings07

object StringConcept01 {
  /*
    String is collection of characters or numbers (array of characters).
    Any method(length) which is used to get information about the object(greetings) is called Accessor Method.
   */

  def main(args: Array[String]): Unit = {
    val greetings = "Hello World!"
    println(greetings)

    val greetingNew = "Hello India!"
    println(greetingNew)

    // Method to get length of string
    val lengthOfString = greetings.length
    println("Length of String is:" + lengthOfString)

    // Concat Method
    val var1 = "Hello "
    val var2 = "World"
    println(var1 + var2)
    println(var1.concat(var2))

    // CharAt Method
    println(var2(3))
    println(var1.charAt(3))

    // Equals Method
    val varA = "Hello"
    val varB = "Hello"
    println(varA.equals(varB)) // Gives true if both the strings have same content
    println(varA == varB) // Same as equals but does additional step. If varA and varB are not null.

    // isEmpty Method
    println(var1.isEmpty)

    // String
    val nameOfCar = "Mercedes"
    val costOfCar = 1200000
    val milageOfCar = 8.3
    printf("Name of car is:%s \nCost of Car is:%d \nMilage of Car is:%f", nameOfCar, costOfCar, milageOfCar)

    // Multiline String
    val multiLineString =
      """
        |Hello!
        |How
        |are
        |you
        |""".stripMargin
    println(multiLineString)

    val multiLineStringA =
      """
        $Hello!
        $How
        $are
        $you
        $""".stripMargin('$')
    println(multiLineString)

    // String Interpolation
    var name = "Kartik"
    var salary = 500.3
    println(s"Hello $name \nSalary is $salary") // s interpolator
    println(f"Name is $name%s and Salary is $salary%f") // f interpolator
    println(raw"Name is $name \nSalary is $salary") // raw interpolator: Same as s but don't take escaping characters

    // Split Method
    println(name.split("a"))

  }

}
