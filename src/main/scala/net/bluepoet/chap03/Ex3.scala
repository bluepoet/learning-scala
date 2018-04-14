package net.bluepoet.chap03

object Ex3 {
  def main(args: Array[String]): Unit = {
    println("===== string to hex ===== ")
    println(stringToHex("cyan"))
    println(stringToHex("megata"))
    println(stringToHex("yellow"))

    println("===== string to prefix hex =====")
    println(stringToPrefixHex("cyan"))
    println(stringToPrefixHex("megata"))
    println(stringToPrefixHex("yellow"))
  }

  def stringToHex(s: String): String = {
    s match {
      case s if s.length != 6 => s"$s length is not 6"
      case other => {
        var result: String = ""
        for (i <- 0 to s.length - 1) {
          result += s"${s.charAt(i).toHexString}"
        }
        result
      }
    }
  }

  def stringToPrefixHex(s: String): String = {
    s match {
      case s if s.length != 6 => s"$s length is not 6"
      case other => {
        var result: String = ""
        for (i <- 0 to s.length - 1) {
          result += s"0x${s.charAt(i).toHexString}"
        }
        result
      }
    }
  }
}
