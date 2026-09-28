package ImplicitClass09A

/*
 * ================================================================
 *                     IMPLICIT CLASS
 * ================================================================
 *
 * Interview Definition:
 * An implicit class allows us to add additional methods to an
 * existing type without modifying its source code or creating a
 * subclass of it.
 *
 * The original class is not actually modified. Scala uses an
 * implicit conversion to wrap the existing value with the implicit
 * class so that its additional methods can be used.
 *
 *
 * ================================================================
 * WHY DO WE NEED IMPLICIT CLASSES?
 * ================================================================
 *
 * Suppose we want to add a new method to an already existing class,
 * such as String.
 *
 * We may not be able to modify the original class because:
 *
 * 1. We do not have access to its source code.
 * 2. The class may belong to a third-party library.
 * 3. The class may be final, so inheritance is not possible.
 *
 * An implicit class provides another way to add additional
 * functionality to that type.
 *
 *
 * ================================================================
 * HOW IT WORKS
 * ================================================================
 *
 * When a method is called on an object:
 *
 *     object.newMethod
 *
 * Scala first checks whether `newMethod` already exists on the
 * object's type.
 *
 * If the method is not found, Scala may look for an applicable
 * implicit conversion that can provide that method.
 *
 * The value is then wrapped by the implicit class and the requested
 * method can be invoked.
 *
 *
 * Conceptually:
 *
 *     Original Object
 *          ↓
 *     Implicit Conversion
 *          ↓
 *     Implicit Class Wrapper
 *          ↓
 *     Additional Method
 *
 *
 * ================================================================
 * IMPORTANT POINTS
 * ================================================================
 *
 * 1. An implicit class does NOT modify the original class.
 *
 * 2. It provides additional functionality through implicit
 *    conversion/wrapping.
 *
 * 3. The implicit class must have a primary constructor that takes
 *    the value being extended.
 *
 * 4. The additional methods are defined inside the implicit class.
 *
 * 5. The implicit class must be in an appropriate scope so that
 *    the compiler can find the implicit conversion.
 *
 * 6. If the original class already contains a method with the same
 *    name, that existing method takes precedence.
 *
 *
 * ================================================================
 * SCALA 3 NOTE
 * ================================================================
 *
 * In Scala 3, extension methods are generally preferred over
 * implicit classes when the goal is simply to add methods to an
 * existing type.
 *
 * Implicit classes are still supported, but extension methods
 * provide a more direct and explicit way to achieve this behavior.
 *
 *
 * ================================================================
 * KEY INTERVIEW POINT
 * ================================================================
 *
 * Implicit Class:
 *
 * "An implicit class is a Scala mechanism that allows additional
 * methods to be made available on an existing type without
 * modifying the original class. The compiler can use an implicit
 * conversion to wrap the existing value with the implicit class."
 *
 */

object ImplicitClassConcept {

  implicit class stringFuncClass(s: String) {
    def firstChar = s.substring(0, 1)
  }

  def main(args: Array[String]): Unit = {
    val strr = ""
    println(strr.toUpperCase())

    // First it will check in String class for function, if not found it will iterate over every implicit class.
    println("First character is:" + strr.firstChar)
  }

}
