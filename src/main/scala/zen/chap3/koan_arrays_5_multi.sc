//MULTIDIMENSIONAL

//like in Java
// you got arrays of arrays

val b = new Array[Array[Double]](10)
b.mkString(" and ")


//construct

val matrix = Array.ofDim[Int](3, 2)
matrix(1)(1)
matrix.indices
matrix(0).indices


