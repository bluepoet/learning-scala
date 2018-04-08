package net.bluepoet.chap02

object TupleEx {
  def main(args: Array[String]): Unit = {
    val info = (5, "bluepoet", true)

    println(info._2)

    val red = "red" -> "0xff0000"
    val reversed = red._2 -> red._1

    println(red._1)
    println(reversed._1)
  }

  def getNumber(num: Int): String = {
    if (num < 0) return ""
    num.toString
  }
}
