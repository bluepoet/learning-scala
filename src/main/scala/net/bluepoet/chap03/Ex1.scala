package net.bluepoet.chap03

object Ex1 {
  def main(args: Array[String]): Unit = {
    val s = "not empty"
    val isEmptyString = s match {
      case s if s != null && s.length > 0 => s
      case other => "n/a"
    }

    println(isEmptyString)
    println(isEmpty(""))
  }

  def isEmpty(s: String): String = {
    s match {
      case s if s != null && s.length > 0 => s
      case other => "n/a"
    }
  }
}
