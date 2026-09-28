// Program of Singleton Object where we can't create the multiple objects.
package SingletonObj_CompanionClassAndObj_CaseClassesAndO06

/*
 * Singleton Object:
 *
 * `object` creates a singleton object, meaning only one instance
 * of that object exists.
 *
 * Unlike a class, we cannot create an object using `new`.
 * Example:
 *   object DemoObj {
 *     val x = 10
 *     val y = 20
 *   }
 *
 * Access members directly using the object name:
 *
 *   DemoObj.x
 *   DemoObj.y
 *
 * Methods can also be accessed directly:
 *
 *   DemoObj.someMethod()
 *
 * Scala does not have the `static` keyword. A singleton object
 * provides similar functionality to many uses of Java's static
 * members, but technically it is a singleton instance.
 */

object DemoObj { // Instead of class this is object
  val x = 10
  val y = 20
}

object SingletonObject01 {

  def main(args: Array[String]): Unit = {
    //        val obj = new DemoObj
  }
}
