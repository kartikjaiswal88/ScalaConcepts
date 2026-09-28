package Strings07

/*
 * String:
 *
 * Interview Definition:
 * String in Scala represents an immutable sequence of characters.
 * It is interoperable with Java's String class on the JVM.
 *
 * 1. Accessor Methods:
 *    Methods used to retrieve information about an object.
 *    Example: length returns the number of characters.
 *
 * 2. Concatenation:
 *    Strings can be combined using `+` or the `concat` method.
 *
 * 3. Character Access:
 *    Characters can be accessed using indexing or `charAt`.
 *    Indexing starts from 0.
 *
 * 4. String Equality:
 *    `equals` compares String contents.
 *    Scala's `==` is null-safe and also performs content-based
 *    equality for Strings.
 *
 * 5. isEmpty:
 *    Checks whether the String contains zero characters.
 *
 * 6. printf:
 *    Provides formatted output using format specifiers such as
 *    `%s` for String, `%d` for integer and `%f` for floating-point.
 *
 * 7. Multiline String:
 *    Triple quotes allow multiline Strings.
 *    `stripMargin` removes the leading margin character.
 *    `|` is the default margin character, but it can be customized.
 *
 * 8. String Interpolation:
 *    `s`  → variable/expression interpolation.
 *    `f`  → formatted interpolation.
 *    `raw` → interpolation without processing escape sequences.
 *
 * 9. split:
 *    Splits a String based on a delimiter/regular expression and
 *    returns an Array of Strings.
 *
 * Key Points:
 *    - String is immutable.
 *    - Indexing starts from 0.
 *    - Scala Strings support Java String methods.
 *    - `==` is null-safe.
 *    - `s`, `f` and `raw` are the main String interpolators.
 */

object StringConcept01 {

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
    println(varA == varB) // Scala's == is null-safe and generally delegates to equality comparison. For Strings, it compares content rather than reference identity.

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
