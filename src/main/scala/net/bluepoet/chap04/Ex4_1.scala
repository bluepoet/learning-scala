package net.bluepoet.chap04

object Ex4_1 {
  def main(args: Array[String]): Unit = {
    println(circleSize(2))
  }

  def circleSize(radius: Int): Double = {
    val pi = 3.14
    pi * Math.pow(radius, 2)
  }
}
