package nag.arvind.gudiseva

object EitherSample {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(94); 
  println("Welcome to the Scala worksheet");$skip(139); 
  
  def divideXByY(x: Int, y: Int): Either[String, Int] = {
      if (y == 0) Left("Dude, can't divide by 0")
      else Right(x / y)
  };System.out.println("""divideXByY: (x: Int, y: Int)Either[String,Int]""");$skip(31); 
  
  println(divideXByY(1, 0));$skip(28); 
  println(divideXByY(1, 1))}
  
}
