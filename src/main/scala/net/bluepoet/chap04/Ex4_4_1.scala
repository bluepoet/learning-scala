package net.bluepoet.chap04

object Ex4_4_1 {
  def main(args: Array[String]): Unit = {
    println(date(123456789000L))
    println(date(238418292000L))
  }

  def date(n: Long): String = {
    val secs = n / 1000

    val day = secs / 86400
    val hour = (secs % 86400) / 3600
    val min = (secs % 3600) / 60
    val sec = secs % 60

    day + " " + hour + " " + min + " " + sec
  }
}
