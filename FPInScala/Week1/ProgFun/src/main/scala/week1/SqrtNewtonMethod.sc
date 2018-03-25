
def sqrt(x: Double): Double = {

  def improve(guess: Double) =
    (guess + x / guess) / 2.0

  def abs(num: Double) : Double =
    if (num > 0) num else -num

  def sqrtIter(guess: Double) : Double =
    if (abs(x - guess * guess) / x <= 0.0001)
      guess
    else
      sqrtIter(improve(guess))

  sqrtIter(guess = 1.0)
}

sqrt(2)
sqrt(9)
sqrt(16)
sqrt(1E-60)
sqrt(1e20)