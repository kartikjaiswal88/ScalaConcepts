package FileHandling24

import scala.util.Using

object ReadCsvFile05 {
  def main(args: Array[String]): Unit = {
    val sampleCsvPath = "src/resources/sampleCsv.csv"
    Using(scala.io.Source.fromFile(sampleCsvPath)) { source =>
      val lines = source.getLines()
      //      lines.foreach(println)

      for (line <- lines) {
        if (line != "Name, Address, Age") {
          val Array(name: String, address: String, age: String) = line.split(',')
          println(s"Name is:$name, address is:$address and age is:$age")
        }
      }
    }
  }
}
