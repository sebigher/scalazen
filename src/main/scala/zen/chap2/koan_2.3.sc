//block expression
// the value of the block is the value of
//the last expression
import math.sqrt
val x = {
  val dx = 4 -2; val dy = 8 + 9
  sqrt(dx + dy)
}
x

// even if we are writing like on one line
//many expressions, still the last expression will give
// the return value: in this case sqrt

val y = {
  val dx = 4 - 2;val dy = 8 + 9;sqrt(dx + dy)
}
y

// in Scala assignments have no value,
// that is a value (the only value) Unit type

val z = {
  val dx = 4 - 2;
  val dy = 8 + 9
  val dz = dx + dy
}
z // Unit's ()

// this is Unit's () and 1 is ignored !!!
val t: Unit = 1
t

//don't chain assignments as in Java

var x1 = 1; var x2 = 2;var x3 = 1

//NO: we will be passing Unit value to a variable of
// type Int
// x1 = x2 = x3
x1
(x2 = x3) // Unit's ()

x2 = x3 //1

//this is in constract with Java
//whereas the value of an assignment is the
//value that is assigned
