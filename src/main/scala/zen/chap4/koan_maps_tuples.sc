//MAPS : collection of a key value pairs
// tuples aggregates of n objects not necessarily of the same type


//CONSTRUCTING A MAP
val map:Map[String, Int] = Map("a" -> 123, "b" -> 234, "c" -> 232)

//SCALA TIP: what's in square brackets [] is always related to type

// immutable map
//cannot change content

//what if you want a mutable map?
val mutableMap = scala.collection.mutable.Map("a" -> 123)


//if you start with a blank map you need to provide the types
//blank
val mutableMap2 = scala.collection.mutable.Map[String, Int]()


//another way to define a map
val map2 = Map(("a",123), ("b", 234), "c" -> 456)


// a map is collection of pair, a pair is (key, value)
// or key -> value


//ACCESSING A MAP
//classic
map("a") //key exists
// map("xxx")  //java.util.NoSuchElementException: key not found: xxx

//returning Option object
map.get("a") //Some(123)
map.get("xxx") //None

map.getOrElse("a", 0) //123
map.getOrElse("xxx", 0) // 0

//check if the key exists first
map.contains("xxx")

val result = if(map.contains("xxx")) map("xxx") else 0

//obviously very used
val result2 = map.getOrElse("xxx", 0)



//turning an immutable map into an immutable map with default values
val scorez = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)
val scorezWithDefault = scorez.withDefaultValue(0)
scorezWithDefault("aaa") //0
scorezWithDefault("Alice")

// the default value based on the key's length for example
val scorezWithDefaultLength = scorez.withDefault(_.length)
scorezWithDefaultLength("Trump")
scorezWithDefaultLength("")





