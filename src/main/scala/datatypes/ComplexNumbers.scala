package datatypes


//TODO re-read about doubles in Java
//TODO consider changing the type from Double to Integers..or generalising it...
case class Complex(real: Double, imaginary: Double = 0.0) {
  def +(that: Complex): Complex = Complex(real + that.real, imaginary + that.imaginary)

  def -(that: Complex): Complex = Complex(real - that.real, imaginary - that.imaginary)

  def *(that: Complex): Complex =
    Complex(real * that.real - imaginary * that.imaginary, real * that.imaginary + imaginary * that.imaginary)

  def magnitude: Double = Math.sqrt(real * real + imaginary * imaginary)

  override def toString: String = s"$real + ${imaginary}i"
}
