package nag.arvind.gudiseva

import scala.util.{Try, Success, Failure}

object TrySuccessFailure {

  println("Demonstration of Scala Try, Success and Failure")
                                                  //> Demonstration of Scala Try, Success and Failure
  
 
	def divide1(numer: Int, denom: Int): Try[Int] = {
		Try(numer / denom)
  }                                               //> divide1: (numer: Int, denom: Int)scala.util.Try[Int]

	divide1(1, 0) match {
	    case Success(i) => println(s"Result: $i")
	    case Failure(s) => println(s"Exception: $s")
	}                                         //> Exception: java.lang.ArithmeticException: / by zero
  
	divide1(1, 1) match {
	    case Success(i) => println(s"Result: $i")
	    case Failure(s) => println(s"Exception: $s")
	}                                         //> Result: 1

	def divide2(numer: Int, denom: Int): Try[Int] = {
		val res = Try(numer / denom)

	  res match {
	    case Success(i) => println("Result: " + i)
	      Success(i)
	    case Failure(e) => println("Exception: " + e.getMessage)
	      Failure(e)
	  }
  }                                               //> divide2: (numer: Int, denom: Int)scala.util.Try[Int]

  println(divide2(1, 0))                          //> Exception: / by zero
                                                  //| Failure(java.lang.ArithmeticException: / by zero)
                                                  
  println(divide2(1, 0).getOrElse(0))             //> Exception: / by zero
                                                  //| 0
                                                   
  println(divide2(1, 1))                          //> Result: 1
                                                  //| Success(1)
                                                  
  println(divide2(1, 1).foreach(println))         //> Result: 1
                                                  //| 1
                                                  //| ()
  
}