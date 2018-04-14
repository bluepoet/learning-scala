package net.bluepoet.chap03

object Ex2 {
  def main(args: Array[String]): Unit = {
    println(checkNumber(2.01d))
    println(checkNumber(0.00d))
    println(checkNumber(-1.00d))
  }

  def checkNumber(n: Double): String = {
    n match {
      case n if n > 0 => "greater"
      case n if n == 0 => "same"
      case n if n < 0 => "less"
    }
  }
}
