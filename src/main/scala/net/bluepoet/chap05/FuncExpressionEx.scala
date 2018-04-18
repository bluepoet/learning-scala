package net.bluepoet.chap05

object FuncExpressionEx {
  def main(args: Array[String]): Unit = {
    def double(x: Int): Int = x * 2
    val myDouble: Int => Int = double
    val myDouble1 = double _

    println(myDouble(2))
    println(myDouble1(2))

    def safeStringOp(s: String, f: String => String): String = {
      if(s != null) f(s) else s
    }

    def reverser(s: String): String = s.reverse

    println(safeStringOp(null, reverser))
    println(safeStringOp("ready", reverser))
    println(safeStringOp("ready", s => s.reverse))
  }
}
