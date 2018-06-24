//Scala don't have enumerated types
//however you got some helper class Enumeration
//you can use

object TrafficLightColor extends  Enumeration{
  val Red, Yellow, Green = Value
  val Grey = Value(10, "grey")
  val Magenta = Value("magenta") // Id = 11 , one more
}

//shortcut for
// val Red = Value; val Yellow = Value; val Green = Value

//each call to Value method returns a new instance of the inner class also called Value

// as with enum, you can pass IDs, names or both to Value


//access

TrafficLightColor.Red

TrafficLightColor.ValueSet

object LightColor extends Enumeration{
  type LightColor  = Value //type alias
  val Red, Yellow, Green = Value
}

LightColor.Red

import LightColor._

class Kko {
  def doWhat(color: LightColor) = {
    if (color == Red) "stop"
    else if (color == Yellow) "hurry up"
    else "go"
  }
}

var kko = new Kko
kko.doWhat(Red)
val color:LightColor = Red
color.id

for(c<- LightColor.values) yield c.id