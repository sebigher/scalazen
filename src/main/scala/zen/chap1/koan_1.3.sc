//Char, Byte, Short, Int, Long, Float, and Double, and a Boolean type.
// 16,   8,   16 ,   32,   64,   32,        64
// there is no distinction between primitive types and classes

//everything is an object

//applying a method to() to an integer
//the parameter it's the end of the range
1.to(10)
1 to 10
//returns a Range(1, 2, ,3, 4, 5, 6, 7 ,8, 9, 10)
// a collection of numbers


// 1 is Int, gets converted to RichInt
// where you have the to() method

1.toString


// there is no need for wrapper classes
//only augment classes
//java ==== scala
// Int --> RichInt (automatically converted)
// ...
//String -> StringOps

"Hello".intersect("World")


//big numbers are pretty usable with regular operators
var bn: BigInt  = 123456789
bn * bn * bn * bn

//in java is painful : bn.multiply ...


// in  Scala you use methods to convert between numeric types
// and not cast as in Java

99.44.toString

"99.44".toDouble

