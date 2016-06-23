package object random {
  private val a = 1664525
  private val b = 1013904223
  private val n = 32
  private var seed = 0

  def setSeed(seed: Int) = {
    this.seed = seed
  }

  def nextInt = {
    seed = (seed * a + b) % (2 ^ n)
    seed
  }

  def nextDouble = {
    nextInt.toDouble / Int.MaxValue.toDouble
  }
}