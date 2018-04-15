package net.bluepoet.chap04

object Ex4_3 {
  def main(args: Array[String]): Unit = {
    printNumber(5, 5, "")
  }

  @annotation.tailrec
  def printNumber(n: Int, counter: Int, s: String): Unit = {
    if(n > 50) print(s)
    else printNumber(n + counter, counter, s + n.toString + " ")
  }
}
