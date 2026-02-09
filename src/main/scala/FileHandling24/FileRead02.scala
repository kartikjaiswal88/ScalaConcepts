package FileHandling24

import scala.util.Using

object FileRead02 {
  /*
    1. scala.io.StdIn.fromFile(filePath) is used to read the file
    2. Using will automatically closed the source.
   */

  def main(args: Array[String]): Unit = {
    val sampleFile = "src/resources/demo.txt"

    //  Option 1
    //    scala.io.Source.fromFile(sampleFile).foreach(x => print(x))

    // Option 2
    Using(scala.io.Source.fromFile(sampleFile)) { source =>
      val lines = source.getLines()
      lines.foreach(println)
    }

  }
}
