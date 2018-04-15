package net.bluepoet.chap04

object Ex4_5 {
  def main(args: Array[String]): Unit = {
    println(pow(2, 3))
  }

  def pow(n:Int, n1: Int): Double = {
    val n2 = Math.pow(n, 2)
    Math.pow(n1, n2)
  }
}
