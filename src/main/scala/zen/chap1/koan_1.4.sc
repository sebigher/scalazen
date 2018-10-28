import scala.math._  //wild card in Scala

//Arithmetic and Operator Overloading”
// +  - * / %  etc are actuallly methods
3 + 4
//shortcut for

3.+(4)
// a method b
// a.method(b)

//that's in fact the INFIX NOTATION
//works for methods that have only one parameter
1.to(10)
1 to 10


// Scala DOESN"T HAVE ++ , -- operator

//instead use +=,-=
//they are not really needed:
var x = 4
x += 1
println(x)

//if a method has no parameters
// you don't have to use parentheses

"Bonjour".sorted


//SCALA has both functions and methods
//What is a function? Logic that does not operate on objects
// in Java u use the static methods for the same purpose
//there is no need for static methods in Scala
sqrt(2) //just consumes 2

// static methods from Java --> equivalent in Scala?
BigInt.probablePrime(100, scala.util.Random) //A method
// it is in fact a static method that was inherited from Java


// 1)use of the singleton objects


// 2)a package can have a package object
// you can import the package and use the methods of the
//package object without any prefix

sqrt(9)
pow(2, 3)


// more: if a package starts with scala you can omit the scala prefix





