package nag.arvind.gudiseva

object OptionSomeNone {

  println("Demonstration of Scala Option, Some and None")
                                                  //> Demonstration of Scala Option, Some and None
  
  def divide(numer: Int, denom: Int): Option[Int] = {
    try {
        Some(numer / denom)
    } catch {
        case e: Exception => None
    }
	}                                         //> divide: (numer: Int, denom: Int)Option[Int]
  println(divide(1, 0))                           //> None
  println(divide(1, 1))                           //> Some(1)
  
  // With pattern matching
  divide(1, 0) match {
  	case Some(i) => println("Result: " + i)
    case None => println("Exception encountered.")
  }                                               //> Exception encountered.
 
   divide(1, 1) match {
   	case Some(i) => println("Result: " + i)
    case None => println("Exception encountered.")
  }                                               //> Result: 1
  
}