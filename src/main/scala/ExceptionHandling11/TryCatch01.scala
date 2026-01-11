package ExceptionHandling11

import java.io.{FileNotFoundException, FileReader, IOException} // Importing package for usage

object TryCatch01 {

  def main(args: Array[String]): Unit = {
    try {
      val f = new FileReader("C:\\Users\\karti\\OneDrive\\Desktop\\DataEngineering\\ScalaLearning\\ScalaConcepts\\src\\main\\scala\\ExceptionHandling11\\Input.txt")
      val x = 3 / 3
      val array = Array(1)
      println(array(1))
    } catch {
      case ex: FileNotFoundException => println("File is not Present at given Path")
      case ex: IOException => println("IOException occured while reading the file")
      case otherEx: Exception => println(s"It will catch all the unhandled exceptions: ${otherEx.printStackTrace()} ")
    }
    finally {
      println("Finally will always be executed irrespective of Exception or not")
    }
  }
}
