import cats.effect.{IO, IOApp}
import datatypes.Algebras.RingNumber
import datatypes.Complex
import othertypes.Qubit
import othertypes.Qubit.measure

//TODO - add and play with Cats library
//TODO - check out other type level libraries
object Main extends IOApp.Simple {
  def run: IO[Unit] = {
    val qubit = Qubit(
      Vector(
        Complex(1.0, 0.0),
        Complex(0.0, 1.0)
      )
    )
    val result = measure(qubit)
    for {
      _ <- IO.println(s"Trying out this algebra library - ${RingNumber(1)}")
      _ <- IO.println(s"Measured: |$result⟩")
    } yield ()
  }
}

