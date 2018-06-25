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
//(n1 / d1) × (n2 / d2) = (n1n2 / d1d2)


import scala.math._

class Fraction(n:Int, d:Int){

  private val num: Int = if (d == 0) 1 else n * sign(d) / gcd(n, d);
  private val den: Int = if (d == 0) 0 else d * sign(d) / gcd(n, d);
  override def toString = num + "/" + den

  def sign(a: Int) =
    if(a > 0 ) 1 else if( a < 0) -1 else 0
  def gcd(a: Int, b: Int): Int =
    if(b == 0) abs(a) else gcd(b, a%b)

  def *(other: Fraction) =
    new Fraction(num * other.num, den * other.den)
}

val f1 = new Fraction(3, 4)
val f2 = new Fraction(2, 5)
println(f1 * f2)