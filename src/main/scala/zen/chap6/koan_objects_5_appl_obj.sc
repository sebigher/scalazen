// each Scala program must start with an
// object's main method

object Hello{
  def main(args: Array[String]): Unit ={
    println("Hello, Dolly!")
  }
}

// classic way

// or

object Hello2 extends App{
  println("Hello, Polly!")
}


// if you need command-line arguments

object Hello3 extends App{
  if(args.length > 0){
    println(f"Hello ${args(0)}")
  }else
  println("Hello, Polly!")
}