//as in Java Unicode idemtifiers are allowed
var quantité: Double = 0.0

//in Scala you can use operator characters in identifiers
//also mathematical symbols

val `val` = 42
val happy_birthday_!!! = "Bonne anniversaire!!!"



//INFIX OPERATORS
 1 to 10

//operator is between the arguments
for (c <- 1 to 10) println(c)

val map = Map(10->"abc", 20 -> "bcd")
//in fact a method call
// 10.->("abc")


//DEFINE YOUR OWN

class Fraction(n:Int, m:Int){
  private val num = n
  private val den = m
}