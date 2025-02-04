import datatypes.Complex
import othertypes.Qubit
import othertypes.Qubit.measure

//TODO - add and play with Cats library
//TODO - check out other type level libraries
object Main {
  def main(args: Array[String]): Unit = {
    val qubit = Qubit(
      Vector(
        Complex(1.0, 0.0),
        Complex(0.0, 1.0)
      )
    )
    val result = measure(qubit)
    println(s"Measured: |$result⟩")
  }
}

