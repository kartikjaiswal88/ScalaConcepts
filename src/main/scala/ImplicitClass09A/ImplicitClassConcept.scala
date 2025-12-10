package ImplicitClass09A


object ImplicitClassConcept {
  /*
      If want to have a function in already defined class then we have two options
    1. Add new function to source code of class but possibly it may not be available.
    2. Extend the class but it can be final class.

    So the solution is Implicit class and we can have new function inside it.
   */

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
