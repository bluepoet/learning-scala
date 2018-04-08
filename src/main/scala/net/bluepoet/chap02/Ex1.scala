package net.bluepoet.chap02

object Ex1 {
  def main(args: Array[String]): Unit = {
    val x = 7
    println(x.isInstanceOf[Int])

    val a = x * 9
    println(a.isInstanceOf[Int])

    val b = a / 5.0
    println(b.isInstanceOf[Double])

    val result = b + 32
    println(result)
    println(result.isInstanceOf[Double])
  }
}
