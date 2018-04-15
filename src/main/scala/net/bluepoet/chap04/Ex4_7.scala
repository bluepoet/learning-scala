package net.bluepoet.chap04

object Ex4_7 {
  def main(args: Array[String]): Unit = {
    println(findIntAndSortFirst(1, "a"))
    println(findIntAndSortFirst("a", 1))
    println(findIntAndSortFirst(1.0d, 2))
    println(findIntAndSortFirst(1.0f, 100))
    println(findIntAndSortFirst(false, 10))
  }

  def findIntAndSortFirst(x: Any, y: Any): (Any, Any) = {
    if(y.isInstanceOf[Int]) (y, x)
    else (x, y)
  }
}
