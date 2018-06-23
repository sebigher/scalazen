//TRAVERSING MAPS
val map = Map("a" -> 123, "b" -> 324, "x" -> 4234)
map
println()
for((k,v) <- map){
  print("k:" + k); print(" ");print("v:" + v)
  println
}

//like in Java, you got keySet
for(k <- map.keySet){
  print( k + "," + map(k))
  println()
}

//values
for(v <- map.values){
  println("value:" + v)
}


//reverse a map: classical q
//means (k, v) -> (v, k)

for((k, v) <- map) yield (v, k)
//Map[String, Int] --> Map[Int, String]

//SORTED MAPS
//there are 2 implementation strategies for maps
// hash tables and balanced trees

// if you need the keys in order use SortedMap

val sortedMap = scala.collection.mutable.SortedMap("b" ->123,
  "a" -> 345 )

//sortedMap: scala.collection.mutable.SortedMap[String,Int] = TreeMap(a -> 345, b -> 123)

//if you need to visit the key in insertion order
// use LinkedHashMap

val linkedHashMap = scala.collection.mutable.LinkedHashMap("c" ->123)

linkedHashMap +=("b" -> 324)
linkedHashMap +=("a" -> 333)

linkedHashMap

for(entry <- linkedHashMap) {
  println(entry)
}

//always the same order which is the insertation order

