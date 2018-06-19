//conditional expression

//if/else has a value
//combines if/else with ?: from Java

val x = 10
val y: Int = if (x > 0) 1 else -1

// the same effect as
var z:Int = 0
if (x > 0) z = 1 else z = -1
z

//first form is better as it can be assigned
// to val

// for the second form you need var

//every expression has a type

val m: Any = if (false) "not good" else 1

//type Any as it is not that obvious
val n: Any = if (true) "go"

//if/statement can yield no value
val t: AnyVal = if(false) 1
t

// but we just said, right?
//every expression has a value

//class Unit solves that:
//class Unit has only one value ()

/// Unit is analog with Java void

// but void has no value
// whareas Unit has only one value
// which is ()
//designated to signal : no useful value

/// no switch statement in Scala