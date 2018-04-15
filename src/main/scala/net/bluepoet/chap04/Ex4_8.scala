package net.bluepoet.chap04

object Ex4_8 {
  def main(args: Array[String]): Unit = {
     println(copyStringInTuple(true, 22.25, "yes"))
  }

  def copyStringInTuple(a: Any, b: Any, c: Any): (Any, String, Any, String, Any, String) = {
    (a, a.toString, b, b.toString, c, c.toString)
  }
}