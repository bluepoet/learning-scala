package net.bluepoet.chap03

object Ex5 {
  def main(args: Array[String]): Unit = {
    multiple3Or5Or3And5(6)
    multiple3Or5Or3And5(10)
    multiple3Or5Or3And5(30)
  }

  def multiple3Or5Or3And5(n: Int): Unit = {
    n match {
      case n if (n % 3 == 0) && (n % 5 == 0) => println("typesafe")
      case n if n % 3 == 0 => println("type")
      case n if n % 5 == 0 => println("safe")
    }
  }
}
