package datatypes

//TODO - generalise this to any Java numeric type
object MatrixType {
  type Matrix = Vector[Vector[Complex]]
}

//Tensor is a matrix of matrices / Generalised matrix definition
object ThreeTensor {
  type Tensor = Vector[Vector[Vector[Complex]]]
}