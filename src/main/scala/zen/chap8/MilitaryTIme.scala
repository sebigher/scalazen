package zen.chap8

class MilitaryTime(val time: Int) extends AnyVal {
  def minutes = time % 100
  def hours = time / 100
  override def toString = f"${time}04d"
}


object kko {
  val milly: MilitaryTime = new MilitaryTime(124234)
  println(milly.time)
}



class MilTime private (val time: Int) extends AnyVal{
  def minutes = time % 100
  def hours = time / 100
  override def toString = f"${time}04d"
}

object MilTime {
  def apply(t: Int) =
    if (0 <= t && t < 2400 && t % 100 < 60) new MilTime(t)
    else throw new IllegalArgumentException
}


//