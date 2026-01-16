package TraitsValueClassAndUniversalTraits12

trait Car {
  def engine() = {
    println("1000cc engine")
  }

  def breaks()

  def tyres()
}

class Mercedes extends Car {

  def breaks(): Unit = {
    println("Disk Breaks...")
  }

  def tyres(): Unit = {
    println("Four Tyres...")
  }

}


object TraitsMain01 {
  /*
    1. Traits: Traits encapsulates methods and field definitions.
    2. Defined with the help of keyword trait.
    3. We cannot create object of trait.
    4. It is only used for inheritance purpose.
    5. We cannot have multiple inheritance in terms of class but can have for traits.
    6. Traits can have abstract methods(methods with declaration only).
    7. Unimplemented methods of traits should be implemented in class extending given trait
    8. Implemented class always try to find field and methods which is declared at last then going to first one.
    9. If same methods are present in both the extended traits then it will execute right one and need override keyword for that method
    10.Abstract class have also declare methods but it is used for single inheritance while trait can be usef for mutliple inheritance.
    11.We can also override the variables of trait in child class
    12.If we want to override the method of trait then we need override keyword.
    13.For defining the abstract class there is keyword called abstract.
    14.To resolve the ambiguity we need to override the method in child class like --> override methodName = super.methodName
    15.Syntax to force inheritance of other classes and traits with particular one:
        trait Car04{
                this : FourWheeler04 with Vehicale04 =>{
                     }
                  }

    16.Value Class: Cannot allocate the runtime object.
    17.Value class always has only 1 PARAMETER WITH TYPE VAL
    18.You cannot extend the value class
    19.Value class cannot extend a trait. That's why you have a universal trait.
    20.trait which extends the Any is called universal trait.
    21.Benefits of value class
       Less Initialization
       Better Performance
       Less Memory Usage
    22.Use cases: Performance and Memory Optimization
   */

  def main(args: Array[String]): Unit = {
    val m1 = new Mercedes
    m1.tyres()
    m1.breaks()
    m1.engine()

  }
}
