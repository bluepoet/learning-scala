package net.bluepoet.chap03

object MatchExpression {
  def main(args: Array[String]): Unit = {
    val s = "test"

    val response = s match {
      case "test" => "ok"
      case other => "no"
    }

    println(response)
  }
}