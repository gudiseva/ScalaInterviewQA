package nag.arvind.gudiseva

import scala.util.Try

object ForYieldGetElse {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(132); 
  println("Demonstration of Scala yield and getOrElse");$skip(131); 
  
  	val result = for {
		  int1 <- Try(Integer.parseInt("1"))
		  int2 <- Try(Integer.parseInt("2"))
		} yield {
		  int1 / int2
		};System.out.println("""result  : scala.util.Try[Int] = """ + $show(result ));$skip(42); 
		
		val answer = result.getOrElse(1);System.out.println("""answer  : Int = """ + $show(answer ))}
}
