
def factorial(x: Double) : Double = {
  def factorialIter(x: Double, acc: Double) : Double  = {
    if (x==0) acc else factorialIter(x-1, acc*x)
  }

  factorialIter(x, 1)
}

factorial(4)
factorial(5)