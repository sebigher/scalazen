//INTEROPS with Java

//USE-CASE
//convert a Java map to a Scala map

//you need to import
import scala.collection.JavaConversions.mapAsScalaMap
//and then
val scores: scala.collection.mutable.Map[String, Int] = new java.util.TreeMap[String, Int]


//properties as scala map
import scala.collection.JavaConversions.propertiesAsScalaMap
val props: scala.collection.Map[String, String] = System.getProperties()

props

//Scala map to Java map
import scala.collection.JavaConversions.mapAsJavaMap
import java.awt.font.TextAttribute._ // Import keys for map below
val attrs = Map(FAMILY -> "Serif", SIZE -> 12) // A Scala map
val font = new java.awt.Font(attrs) // Expects a Java map

