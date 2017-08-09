package nag.arvind.gudiseva

import scala.util.{Try, Success, Failure}

object TrySuccessFailure {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(160); 

  println("Demonstration of Scala Try, Success and Failure");$skip(81); 
  
 
	def divide1(numer: Int, denom: Int): Try[Int] = {
		Try(numer / denom)
  };System.out.println("""divide1: (numer: Int, denom: Int)scala.util.Try[Int]""");$skip(124); 

	divide1(1, 0) match {
	    case Success(i) => println(s"Result: $i")
	    case Failure(s) => println(s"Exception: $s")
	};$skip(126); 
  
	divide1(1, 1) match {
	    case Success(i) => println(s"Result: $i")
	    case Failure(s) => println(s"Exception: $s")
	};$skip(254); 

	def divide2(numer: Int, denom: Int): Try[Int] = {
		val res = Try(numer / denom)

	  res match {
	    case Success(i) => println("Result: " + i)
	      Success(i)
	    case Failure(e) => println("Exception: " + e.getMessage)
	      Failure(e)
	  }
  };System.out.println("""divide2: (numer: Int, denom: Int)scala.util.Try[Int]""");$skip(26); 

  println(divide2(1, 0));$skip(89); 
                                                  
  println(divide2(1, 0).getOrElse(0));$skip(77); 
                                                   
  println(divide2(1, 1));$skip(93); 
                                                  
  println(divide2(1, 1).foreach(println))}
  
}
