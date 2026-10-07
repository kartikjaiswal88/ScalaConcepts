package TraitsValueClassAndUniversalTraits12

trait Car {

  def engine() = {
    println("1000cc engine")
  }

  def brakes()

  def tyres()
}

class Mercedes extends Car {

  def brakes(): Unit = {
    println("Disk Brakes...")
  }

  def tyres(): Unit = {
    println("Four Tyres...")
  }
}

object TraitsMain01 {

  /*
    =========================
             TRAITS
    =========================

    1. A trait is a mechanism used to encapsulate methods and
       field definitions.

    2. A trait is defined using the 'trait' keyword.

    3. We cannot directly create an object of a trait.

    4. Traits are mainly used for code reuse and composition.

    5. Scala does not support multiple inheritance of classes,
       but a class can extend multiple traits.

    6. A trait can contain abstract methods
       (methods without implementation).

    7. A concrete class extending a trait must implement
       its abstract members.

    8. Traits can contain both implemented and abstract methods.

    9. If multiple traits contain the same method, Scala uses
       Trait Linearization to determine which implementation
       is called.

   10. If the same method is inherited from multiple traits,
       the trait appearing on the right side generally gets
       priority.

   11. If required, the class can override the method to resolve
       ambiguity and provide its own implementation.

   12. The 'override' keyword is required when overriding an
       already implemented concrete method or field.

   13. An abstract class is declared using the 'abstract' keyword.

   14. Abstract classes support single class inheritance,
       whereas a class can mix in multiple traits.

   15. A trait can require a class to have a particular type
       using a self-type annotation:

       trait Car04 {
         this: FourWheeler04 with Vehicle04 =>
       }

   16. A Value Class is a special Scala class designed to avoid
       allocating an object in many situations.

   17. A value class must:
       - extend AnyVal
       - have exactly one parameter
       - have a 'val' parameter

       Example:

       class Meter(val value: Double) extends AnyVal

   18. A value class cannot be extended by another class.

   19. A value class cannot extend a normal trait because that
       could require object allocation.

   20. Universal Traits are traits that extend Any.

       Example:

       trait Printable extends Any {
         def print(): Unit
       }

       A universal trait can be mixed into a value class.

   21. Benefits of Value Classes:
       - Can reduce object allocation
       - Can reduce memory overhead
       - Can improve performance in suitable cases

   22. Use cases:
       - Type safety
       - Avoiding unnecessary wrapper objects
       - Performance optimization in suitable scenarios
   */

  def main(args: Array[String]): Unit = {

    val m1 = new Mercedes

    m1.tyres()
    m1.brakes()
    m1.engine()
  }
}