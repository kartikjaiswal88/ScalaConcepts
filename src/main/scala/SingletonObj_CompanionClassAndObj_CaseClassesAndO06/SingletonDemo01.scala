// Program of basic class where we can create the multiple objects
package SingletonObj_CompanionClassAndObj_CaseClassesAndO06

class Demo(a: Int, b: Int) {
  val x = b
  val y = a

  def printValues(): Unit = {
    println(s"x is:$x and y is:$y")
  }
}


object SingletonDemo02 {
  def main(arg: Array[String]): Unit = {
    var demoObj = new Demo(3, 7)
    demoObj.printValues()

    demoObj = new Demo(6, 6)
    demoObj.printValues()
  }
}
