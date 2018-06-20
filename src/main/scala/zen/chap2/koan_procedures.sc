//PROCEDURES aka function that returns no value

//why would you call it?
//for the side effects only

//convention: if the function body
// is enclosed in braces without the
// preceding =
// then the returning is Unit

def box(str: String) {
  println(s"Hello ${str} !")
}
box("John")

// other way to write it: explicitly

def boxy(str: String):Unit = {
  println(s"Hello  $str !")
}

boxy("Iniesta")
