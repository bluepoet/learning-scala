package net.bluepoet.chap05

object FuncExpressionEx {
  def main(args: Array[String]): Unit = {
    def double(x: Int): Int = x * 2
    val myDouble: Int => Int = double
    val myDouble1 = double _

    println(myDouble(2))
    println(myDouble1(2))
  }
}
