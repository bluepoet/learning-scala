package net.bluepoet.chap04

object Ex4_6 {
  def main(args: Array[String]): Unit = {
    val ex1 = distance(0, 0)
    val ex2 = distance(1, 5)
    val ex3 = distance(7, 2)

    println(ex1)
    println(ex2)
    println(ex3)
  }

  def distance(n: Int, n1: Int): (Double, Double) = {
    val x = half(n)
    val y = half(n1)
    (x, y)
  }

  def half(n: Int): Double = {
    if (n == 0) n
    else n / 2.0
  }
}
