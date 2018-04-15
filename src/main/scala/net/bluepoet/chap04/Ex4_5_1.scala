package net.bluepoet.chap04

object Ex4_5_1 {
  def main(args: Array[String]): Unit = {
    println(pow1(2, 5))
    println(pow2(2, 5, 1.0))
  }

  def pow1(n: Int, c: Int): Double = {
    var p = 1; for(i <- 1 to c) p *= n; p
  }

  @annotation.tailrec
  def pow2(n: Int, c: Int, r: Double = 1.0): Double = {
    if(c < 1) r
    else pow2(n, c-1, n * r)
  }
}
