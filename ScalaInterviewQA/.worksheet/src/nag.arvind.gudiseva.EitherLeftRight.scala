package nag.arvind.gudiseva

object EitherLeftRight {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(113); 

  println("Demonstration of Scala Either, Left and Right");$skip(156); 
  
  def divide(numer: Int, denom: Int): Either[String, Int] = {
      if (denom == 0) Left("Error: can't divide by 0")
      else Right(numer / denom)
  };System.out.println("""divide: (numer: Int, denom: Int)Either[String,Int]""");$skip(27); 
  
  println(divide(1, 0));$skip(24); 
  println(divide(1, 1));$skip(153); 
  
  // With pattern matching
  divide(1, 0) match {
      case Left(s) => println("Exception: " + s)
      case Right(i) => println("Result: " + i)
  };$skip(125); 
 
  divide(1, 1) match {
      case Left(s) => println("Exception: " + s)
      case Right(i) => println("Result: " + i)
  }}
  
}
