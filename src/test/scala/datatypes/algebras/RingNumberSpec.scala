package datatypes.algebras

import algebra.laws.RingLaws
import datatypes.Algebras.RingNumber
import org.scalatest.funsuite.AnyFunSuite
import org.scalatestplus.scalacheck.ScalaCheckDrivenPropertyChecks
import org.typelevel.discipline.scalatest.FunSuiteDiscipline

class RingNumberSpec extends AnyFunSuite with ScalaCheckDrivenPropertyChecks with FunSuiteDiscipline {
  checkAll("Does RingNumber obey all the Ring Laws", RingLaws[RingNumber].ring)
}
