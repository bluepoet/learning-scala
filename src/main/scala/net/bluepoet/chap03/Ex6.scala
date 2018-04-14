package net.bluepoet.chap03

object Ex6 {
  def main(args: Array[String]): Unit = {
    multiple3Or5Or3And5(6)
    multiple3Or5Or3And5(10)
    multiple3Or5Or3And5(30)
    multiple3Or5Or3And5(7)
  }

  def multiple3Or5Or3And5(n: Int): Unit = {
    if(n % 3 == 0 && n % 5 == 0) println("typesafe") else { if(n % 3 == 0) println("type") else { if(n % 5 == 0) println("safe") else println("not match")}}
  }
}
