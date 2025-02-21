package datatypes.Algebras

import org.scalacheck.{Arbitrary, Gen}
import algebra.Eq
import algebra.ring.Ring

case class RingNumber(value: Int) extends AnyVal

object RingNumber {
  implicit val ringInstance: Ring[RingNumber] = new Ring[RingNumber] {
    override def zero: RingNumber = RingNumber(0)

    override def one: RingNumber = RingNumber(1)

    override def plus(x: RingNumber, y: RingNumber): RingNumber = RingNumber(x.value + y.value)

    override def times(x: RingNumber, y: RingNumber): RingNumber = RingNumber(x.value * y.value)

    override def negate(x: RingNumber): RingNumber = RingNumber(-x.value)
  }

  implicit val eqInstance: Eq[RingNumber] = new Eq[RingNumber] {
    def eqv(x: RingNumber, y: RingNumber): Boolean = x.value == y.value
  }

  // Arbitrary instance for RingNumber
  implicit val arbitraryRingNumber: Arbitrary[RingNumber] = Arbitrary {
    // Generate random values for RingNumber
    Gen.choose(Int.MinValue, Int.MaxValue).map(RingNumber)
  }
}