package FunctionalProgramming17

object FunctionByName02 {
  /*

     1. It will first execute the outside function "exec" and then it will execute the inside function "time"
        everytime t is being referred.
     2. Since outside function "time" got executed first, it calls inside function "time()" using the
        value of referenced variable and it is called as "Function by Name"

   */

  def main(args: Array[String]): Unit = {
    println("Main function:" + exec(time(), time2()))
  }

  val time: () => Long = () => {
    println("Inside the time function...")
    System.nanoTime
  }

  val time2: () => Long = () => {
    println("Inside the time2 function...")
    System.nanoTime
  }

  def exec(t: =>  Long, t2: =>Long): Long = {
    println("Inside the execution function...")
    println("Time:" + t)
    println("Time2:" + t2)
    println("Exiting from the execution function...")
    return t
  }

}
