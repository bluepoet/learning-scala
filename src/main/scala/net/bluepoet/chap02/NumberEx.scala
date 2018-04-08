package net.bluepoet.chap02

object NumberEx {
  def main(args: Array[String]): Unit = {
    val a: Byte = 10
    val b: Short = a
    val c: Double = b

    println(b.isInstanceOf[Short])
    println(c.isInstanceOf[Double])

    val l: Long = 20
    println(l.toInt.isInstanceOf[Int])

    val yellowRGB = 0xfff00
    println(yellowRGB.isInstanceOf[Int])

    val pi = 3.14
    println(pi.isInstanceOf[Double])
  }
}
