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

//GUARDS: each generator can have a guard condition
for(i <- 1 to 3; j <-1 to 3 if i != j) // no semicolon before the if
  print(f"${10*i + j}%3d")

//DEFINTIONS: any number of definition (like variables to be used inside of the loop)
for (i <- 1 to 3; from = 4 -i; j <- from to 3 )
  print(f"${10*i + j}%3d")

// FOR COMPREHENSION:  yield
// when the body of the loop starts with yield

for (i <- 1 to 10) yield i % 3

//the loop constructs a collection of values,
// one value for each iteration

// generated collection is compatible with the first generator
// in this case c
for (c <- "Hello"; i <- 0 to 1) yield (c+ i).toChar // String = HIeflmlmop

// generated collection is compatible with the first generator
// in this case i
for (i <- 0 to 1; c <- "Hello" ) yield (c+ i).toChar // indexed Char
//Vector(H, e, l, l, o, I, f, m, m, p)

//matter of taste
//instead of
for(i <- 1 to 3; j <-1 to 3 if i != j) // no semicolon before the if
  print(f"${10*i + j}%3d")

//use new lines but go for curly brackets

for {
  i<- 1 to 2
  from = 4 -i
  j <- from to 3
} print(f"${10*i + j}%3d")
