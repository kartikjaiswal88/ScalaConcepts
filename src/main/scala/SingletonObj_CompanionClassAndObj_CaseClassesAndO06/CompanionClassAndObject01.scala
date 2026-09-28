package SingletonObj_CompanionClassAndObj_CaseClassesAndO06

/*
 * Companion Class and Companion Object:
 *
 * When a class and an object have the same name and are defined
 * in the same source file, they are called a Companion Class
 * and Companion Object.
 *
 * Example:
 *
 *   class Student { ... }
 *   object Student { ... }
 *
 * The companion class and companion object can access each
 * other's private members.
 *
 * Class:
 *   - Used to create multiple instances using `new`.
 *   - Contains instance members.
 *
 * Companion Object:
 *   - Is a singleton object.
 *   - Used to access members directly using the object name.
 *   - Commonly used for functionality similar to Java's static
 *     members, such as factory methods.
 *
 * A companion object can access the private members of its companion class,
    and the companion class can access the private members of its companion object.
    Code outside the companion relationship cannot directly access those private members.
 */

class CompanionClassAndObject01 {
  private var x = 6;

  def getValue(): Unit = {
    println(s"Value of x is:${x} and value of y is:${CompanionClassAndObject01.y}")
  }
}

object CompanionClassAndObject01 {

  var y = 4;

  def main(arg: Array[String]): Unit = {
    val companionClassObject = new CompanionClassAndObject01
    println(s"Value of x is:${companionClassObject.x} and value of y is:${CompanionClassAndObject01.y}")
    companionClassObject.getValue()
  }

}
