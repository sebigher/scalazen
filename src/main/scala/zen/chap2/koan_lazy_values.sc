//LAZY VALUES

// initialization is deferred until
// accessed for the first time

lazy val words =
  scala.io.Source.fromFile("sample.txt").mkString

// if the words value is never used
//further on in the program
//then file is never opened

//essential for lazy data structures

// lazy values are halfway between
//val and def


val ops = "Something costly"
//evaluated immediately

lazy val ops2 = "Something costly 2"
//evaluated first time when ops2 is used

def ops = "Something costly"
// laziness is no cost free
//every time a lazy value is accessed
// a method is called to check (thread-safe)
//whether the value has already been
//initialized ----duh!

