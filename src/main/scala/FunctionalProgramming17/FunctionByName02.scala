package FunctionalProgramming17

/*
 * Function Call by Name:
 *
 * Interview Definition:
 * Call-by-name is a parameter-passing mechanism in which the
 * argument expression is not evaluated when the function is called.
 * Instead, it is evaluated whenever the parameter is referenced
 * inside the function.
 *
 * Syntax:
 *   def functionName(parameter: => Type)
 *
 * Execution:
 * 1. Outer function starts executing first.
 * 2. Argument expression is not evaluated immediately.
 * 3. When the parameter is referenced, the argument expression
 *    is evaluated.
 * 4. If the parameter is referenced multiple times, the argument
 *    can be evaluated multiple times.
 *
 * In this program:
 * 1. exec() starts executing first.
 * 2. `t` is referenced → time() executes.
 * 3. `t2` is referenced → time2() executes.
 * 4. `t` is referenced again in `return t` → time() executes again.
 *
 * Therefore:
 *   time()  → executed 2 times
 *   time2() → executed 1 time
 *
 * Difference from Call-by-Value:
 *   Call-by-Value → argument is evaluated before function execution.
 *   Call-by-Name  → argument is evaluated when the parameter is used.
 *
 * Important:
 * `() => Long` is a function value, whereas `=> Long` represents
 * a call-by-name parameter. They are different concepts.
 */

object FunctionByName02 {

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
