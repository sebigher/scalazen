//Arithmetic and Operator Overloading”
// +  - * / %  etc are actuallly methods
3 + 4
//shortcut for

3.+(4)
// a method b
// a.method(b)

// Scala DOESN"T HAVE ++ , -- operator

//instead use +=,-=

var x = 4
x += 1
println(x)

//if a method has no parameters
// you don't have to use parantheses

"Bonjour".sorted

// static methods from Java --> equivalent in Scala?

// 1)use of the singleton objects


// 2)a package can have a pacKage object
// you can import the package and use the methods of the
//package object without any prefix


import scala.math._  //wild card in Scala

sqrt(9)
pow(2, 3)


// more: if a package starts with scala you can omit the scala prefix





