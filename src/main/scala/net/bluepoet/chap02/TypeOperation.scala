package net.bluepoet.chap02

object TypeOperation {
  def main(args: Array[String]): Unit = {
    println(5.asInstanceOf[Long])
    println((7.0 / 5).getClass)
    println((5.0).isInstanceOf[Float])
    println("A".hashCode)
    println(20.toByte)
    println((3.0 / 4.0).toString)

  }
}
