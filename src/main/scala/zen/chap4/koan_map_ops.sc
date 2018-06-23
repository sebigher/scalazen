
//UPDATING mutable MAP VALUES
//YOU CANNOT UPDATE IMMUTABLE MAP !!!
val map = Map("a" ->123, "b" -> 234)

//immutable empty map
val map2: Map[String, Int] = Map.empty


//mutable map
val mapMu = scala.collection.mutable.Map[String, Int]()
mapMu

mapMu.get("aaa")
//mapMu("a") = 123 //bug in Scala worksheet

//add
mapMu +=(("a", 123), ("b", 234))
mapMu

//remove
mapMu -= "a"
mapMu -=("c") //nothing to do



//You cannot update immutable map
//but you can yield another map with the desire update
val immu = Map("x"-> 123, "y" -> 34)
val myMap = immu + ("z" -> 2324) + ("x"-> 2222)
//works also for updating  values

//use a var for saving the same reference

var yourMap = immu
yourMap = yourMap + (("y" -> 0),("z" -> 3432))
//delete by key
yourMap -= "z"
yourMap //no more z

//or

yourMap = yourMap - "y"
yourMap

//TIP
// is not inefficient to keep constructing new maps,
// The old and new maps share most of their structure.
// This is possible because they are immutable !!!















