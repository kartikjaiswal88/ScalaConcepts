package FunctionalProgramming17

import java.lang.System

object FunctionByValue01 {
  /*
     1. It will first execute the inside function "time" and then it will execute the outside function "exec"
     2. Since inside function "time" got executed first, it calls outside function "exec(valueOftime)" using the
        value of inside function and it is called as "Function by Value"
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

  def exec(t: Long, t2:Long): Long = {
    println("Inside the execution function...")
    println("Time:" + t)
    println("Time2:" + t2)
    println("Exiting from the execution function...")
    return t
  }
}
