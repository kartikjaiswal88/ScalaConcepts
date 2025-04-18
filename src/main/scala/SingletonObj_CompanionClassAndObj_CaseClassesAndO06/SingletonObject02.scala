// Program of Singleton Object where we can't create the multiple objects.
package SingletonObj_CompanionClassAndObj_CaseClassesAndO06

object DemoObj { // Instead of class this is object
  val x = 10
  val y = 20
}

object SingletonObject01 {
  /*
   We cannot create the object of object like val obj = new DemoObj.
   We access the variables of object like obj.variableName and same for method also.
   We created the object but behind the scenes(when we compile), it created a class(with static members) for it.

   */
  def main(args: Array[String]): Unit = {
    //        val obj = new DemoObj
  }
}
