package othertypes

import datatypes.Complex
import datatypes.MatrixType.Matrix

case class Qubit(state: Vector[Complex]) {
  require(state.length == 2, "A qubit must have two components.")
}

object Qubit {
  // Predefined basis states
  val zero: Qubit = Qubit(Vector(Complex(1, 0), Complex(0, 0))) // |0⟩
  val one: Qubit  = Qubit(Vector(Complex(0, 0), Complex(1, 0))) // |1⟩

  // Create a qubit from probabilities
  def fromProbabilities(alpha: Complex, beta: Complex): Qubit = {
    require(
      math.abs(alpha.magnitude * alpha.magnitude + beta.magnitude * beta.magnitude - 1) < 1e-10,
      "Qubit amplitudes must be normalized (|α|² + |β|² = 1)"
    )
    Qubit(Vector(alpha, beta))
  }

  def applyGate(gate: Matrix, qubit: Qubit): Qubit = {
    val newState: Vector[Complex] = gate.map(row =>
      row.zip(qubit.state).map {
        case (gate, qubit) => gate * qubit }.reduce(_ + _)
    )
    Qubit(newState)
  }

  def measure(qubit: Qubit): Int = {
    val probabilities = qubit.state.map(x => x.real * x.imaginary)
    val randomValue = scala.util.Random.nextDouble()
    if (randomValue < probabilities(0)) 0 else 1
  }
}
