// shadowing a la Scala

val n = "abc"
for(n <- 1 to 5) {
  println(n)
}

//there is no prohibition to use
//the same name for local variables with
//overlapping scope


// advanced for

//1) multiple generators
for(i <- 1 to 3; j <- 2 to 6)
  print(f"${10*i + j}%3d")

//each generator can have a guard condition
for(i <- 1 to 3; j <-1 to 3 if i != j)
  print(f"${10*i + j}%3d")

