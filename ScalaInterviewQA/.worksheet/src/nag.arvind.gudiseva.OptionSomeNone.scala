package nag.arvind.gudiseva

object OptionSomeNone {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(111); 

  println("Demonstration of Scala Option, Some and None");$skip(152); 
  
  def divide(numer: Int, denom: Int): Option[Int] = {
    try {
        Some(numer / denom)
    } catch {
        case e: Exception => None
    }
	};System.out.println("""divide: (numer: Int, denom: Int)Option[Int]""");$skip(24); 
  println(divide(1, 0));$skip(24); 
  println(divide(1, 1));$skip(151); 
  
  // With pattern matching
  divide(1, 0) match {
  	case Some(i) => println("Result: " + i)
    case None => println("Exception encountered.")
  };$skip(125); 
 
   divide(1, 1) match {
   	case Some(i) => println("Result: " + i)
    case None => println("Exception encountered.")
  }}
  
}
