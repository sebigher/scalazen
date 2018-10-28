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

// in Scala assignments have no useful value,
// that is the value () of Unit type

val z = {
  val dx = 4 - 2;
  val dy = 8 + 9
  val dz = dx + dy
}
z // Unit's ()

// this is Unit's () and 1 is ignored !!!
val t: Unit = 1
t

var x1 = 1; var x2 = 2;var x3 = 1

// x1 = x2 = x3
//don't chain assignments as in Java
//WHY NO:
// because we will be passing Unit value
// to a variable of type Int
x1
(x2 = x3) // Unit's ()

x2 = x3 //1

//this is in contrast with Java
//whereas the value of an assignment is the
//value that is assigned !!!
