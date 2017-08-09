package nag.arvind.gudiseva

import scala.util.Try

object ForYieldGetElse {
  println("Demonstration of Scala yield and getOrElse")
                                                  //> Demonstration of Scala yield and getOrElse
  
  	val result = for {
		  int1 <- Try(Integer.parseInt("1"))
		  int2 <- Try(Integer.parseInt("2"))
		} yield {
		  int1 / int2                     //> result  : scala.util.Try[Int] = Success(0)
		}
		
		val answer = result.getOrElse(1)  //> answer  : Int = 0
}