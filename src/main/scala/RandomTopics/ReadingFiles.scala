package RandomTopics

import java.io.File
import java.util.Scanner

object ReadingFiles {

  val filePath = "C:\\Users\\karti\\OneDrive\\Desktop\\DataEngineering\\ScalaLearning\\ScalaConcepts\\src\\resources\\demo.txt"

  // First Way
  def readFileUsingFileObject() = {
    val file = new File(filePath)
    val scanner = new Scanner(file)
    while (scanner.hasNextLine) {
      val line = scanner.nextLine()
      println(line)
    }
  }

  // Second Way

  def main(args: Array[String]): Unit = {
    ReadingFiles.readFileUsingFileObject()
  }

}
