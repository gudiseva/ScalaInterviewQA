package nag.arvind.gudiseva

object EitherLeftRight {

  println("Demonstration of Scala Either, Left and Right")
                                                  //> Demonstration of Scala Either, Left and Right
  
  def divide(numer: Int, denom: Int): Either[String, Int] = {
      if (denom == 0) Left("Error: can't divide by 0")
      else Right(numer / denom)
  }                                               //> divide: (numer: Int, denom: Int)Either[String,Int]
  
  println(divide(1, 0))                           //> Left(Error: can't divide by 0)
  println(divide(1, 1))                           //> Right(1)
  
  // With pattern matching
  divide(1, 0) match {
      case Left(s) => println("Exception: " + s)
      case Right(i) => println("Result: " + i)
  }                                               //> Exception: Error: can't divide by 0
 
  divide(1, 1) match {
      case Left(s) => println("Exception: " + s)
      case Right(i) => println("Result: " + i)
  }                                               //> Result: 1
  
}