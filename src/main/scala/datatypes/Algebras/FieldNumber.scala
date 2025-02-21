package datatypes.Algebras

import algebra.ring.Field

//Doubles...Ints.....Generic type
case class FieldNumber(value: Int) extends AnyVal

object FieldNumber {
  implicit val fieldInstance: Field[FieldNumber] = new Field[FieldNumber] {
    override def zero: FieldNumber = FieldNumber(0)

    override def one: FieldNumber = FieldNumber(1)

    override def plus(x: FieldNumber, y: FieldNumber): FieldNumber = FieldNumber(x.value + y.value)

    override def times(x: FieldNumber, y: FieldNumber): FieldNumber = FieldNumber(x.value * y.value)

    override def negate(x: FieldNumber): FieldNumber = FieldNumber(-x.value)

    //------ Division ------

    override def div(x: FieldNumber, y: FieldNumber): FieldNumber =
      if (y.value == 0) throw new ArithmeticException("Division by zero")
      else FieldNumber(x.value / y.value)

    override def reciprocal(x: FieldNumber): FieldNumber =
      if (x.value == 0) throw new ArithmeticException("Division by zero")
      else FieldNumber(1 / x.value)
  }
}
