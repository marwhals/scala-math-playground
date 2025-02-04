package othertypes

/**
 * Quantum gates are used to manipulate Qubits
 */

//TODO - read about quantum gates
import datatypes.Complex
import datatypes.MatrixType.Matrix

object QuantumGates {
  val I: Matrix = Vector(
    Vector(Complex(1), Complex(0)),
    Vector(Complex(0), Complex(1))
  ) // Identity Gate

  val X: Matrix = Vector(
    Vector(Complex(0), Complex(1)),
    Vector(Complex(1), Complex(0))
  ) // Pauli-X (NOT) Gate

  val H: Matrix = Vector(
    Vector(Complex(1 / Math.sqrt(2)), Complex(1 / Math.sqrt(2))),
    Vector(Complex(1 / Math.sqrt(2)), Complex(-1 / Math.sqrt(2)))
  ) // Hadamard Gate
}