//TUPLES

//enclose individual values in ()

val s = (1, "aaa", 4.5)

//Access

s._1
s._2
s _3  //still valid

//Warning: the component positions starting from 1
// unlike arrays or string positions

//use pattern matching to get at the components

val (first, second, third) = s
first

//when you don't need all the components

val (x, y, _) = s
x;y

//useful for functions  that return more than one value

//ZIPPING
val symbols = Array("<", "-", ">")
val counts = Array(2, 10, 2)
val pairs = symbols.zip(counts) // Array((<,2), (-,10), (>,2))


//processing together
for ((s, n) <- pairs) println(s * n)



// collection of keys into map
// keys.zip(values)



