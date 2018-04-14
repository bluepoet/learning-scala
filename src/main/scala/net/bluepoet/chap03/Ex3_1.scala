package net.bluepoet.chap03

object Ex3_1 {
  def main(args: Array[String]): Unit = {
    println(colorToHex("cyan"))
    println(colorToHex("magenta"))
    println(colorToHex("yellow"))
    println(colorToHex("red"))
  }

  def colorToHex(s: String): String = {
    s match {
      case "cyan" => "#00ffff"
      case "magenta" => "#ff00ff"
      case "yellow" => "#ffff00"
      case s => s"$s not match color hex"
    }
  }
}
