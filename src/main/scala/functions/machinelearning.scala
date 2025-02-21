package functions

trait functions {
  def bayesianPosterior (prior: Double, likelihood: Double, evidence: Double): Double = (likelihood * prior) / evidence

  def dotProduct(A: Vector[Double], B: Vector[Double]): Double = {
    (A zip B).map { case (a, b) => a * b }.sum
  }

  def magnitude(A: Vector[Double]): Double = {
    Math.sqrt(A.map(x => x * x).sum)
  }

  /*
  - Make this generic and use characters and strings?????
   */
  def cosineSimilarity(A: Vector[Double], B: Vector[Double]): Double = {
    val dotProd = dotProduct(A, B)
    val magnitudeA = magnitude(A)
    val magnitudeB = magnitude(B)

    dotProd / (magnitudeA * magnitudeB)
  }

}