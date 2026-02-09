package FileHandling24

import java.io.{BufferedWriter, File, FileWriter, PrintWriter}

object FileWrite04 {
  /*
    Exception Handling
    1. PrintWriter: Error handling using checkError method
    2. FileWriter + BufferedWriter: Can use try-catch block

    Flushing Data
    1. PrintWriter: Costly(slow), it flush
    2. FileWriter + BufferedWriter: You have to flush manually(fast) or it will be flush when you close it.
   */

  def main(args: Array[String]): Unit = {
    //Option 1: Using printWriter
    val outPutFilePath = "src/resources/demoOutput.txt"

    // Step 1: Create instance of file
    val outputFile = new File(outPutFilePath)

    // Step 2: Create instance of PrintWriter
    val outputWriter = new PrintWriter(outputFile)

    // Step 3: Write into the file
    outputWriter.print("Hellow World \n")
    outputWriter.print("Hellow World again\n")
    outputWriter.print("Hellow World again again\n")

    // Step 4: Write into the file
    outputWriter.close()
    println(s"Error is:${outputWriter.checkError()}")


    //Option 2: Using FileWriter
    val outPutFilePath2 = "src/resources/demoOutput2.txt"

    // Step 1: Create instance of file
    val outputFile2 = new File(outPutFilePath2)

    // Step 2: Create instance of PrintWriter
    val outputWriter2 = new FileWriter(outputFile2)

    // Step 3: Write into the file
    outputWriter2.write("Hellow World !\n")
    outputWriter2.write("Hellow World again !!\n")
    outputWriter2.write("Hellow World again again !!!\n")

    // Step 4: Write into the file
    outputWriter2.close()


    //Option 3: Using BufferedWriter
    val outPutFilePath3 = "src/resources/demoOutput3.txt"

    // Step 1: Create instance of file
    val outputFile3 = new File(outPutFilePath3)

    // Step 2: Create instance of PrintWriter
    val outputWriter3 = new FileWriter(outputFile3)

    // Step 2(a): Create instance of buffered writer
    val bufferWriter3 = new BufferedWriter(outputWriter3)

    // Step 3: Write into the file
    bufferWriter3.write("Hellow World !\n")
    bufferWriter3.write("Hellow World again !!\n")
    bufferWriter3.write("Hellow World again again !!!\n")

    // Step 4: Write into the file
    bufferWriter3.close()
  }

}
