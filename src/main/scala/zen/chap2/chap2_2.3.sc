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
//many expressions, still the last will give
// the return value

val y = {
  val dx = 4 - 2;
  val dy = 8 + 9;
  sqrt(dx + dy)
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


