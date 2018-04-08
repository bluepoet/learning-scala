package net.bluepoet.chap02

object Ex2 {
  def main(args: Array[String]): Unit = {
    println(convert(7))
    println(convert1(7))
  }

  def convert(celsius: Int): Int = {
    val result = celsius * 9 / 5 + 32
    result
  }

  def convert1(celsius: Int): Int = {
    val result = celsius * 9 / 5.0 + 32
    result.toInt
  }
}
