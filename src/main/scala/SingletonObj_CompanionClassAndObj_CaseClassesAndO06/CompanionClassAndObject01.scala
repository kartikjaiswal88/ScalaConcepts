package SingletonObj_CompanionClassAndObj_CaseClassesAndO06

class CompanionClassAndObject01 {
  private var x = 6;

  def getValue(): Unit = {
    println(s"Value of x is:${x} and value of y is:${CompanionClassAndObject01.y}")
  }
}

object CompanionClassAndObject01 {
  /*
    Name of the class and Object is Same.
    We can use each others variables and methods.
   */

  var y = 4;

  def main(arg: Array[String]): Unit = {
    val companionClassObject = new CompanionClassAndObject01
    println(s"Value of x is:${companionClassObject.x} and value of y is:${CompanionClassAndObject01.y}")
    companionClassObject.getValue()
  }

}
