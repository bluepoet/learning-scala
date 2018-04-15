package net.bluepoet.chap04

object Ex4_4 {
  def main(args: Array[String]): Unit = {
    println(date(20180101235959000L))
  }

  def date(n: Long): String = {
    val s = n.toString
    if(s.length != 17) "invalid date"
    else {
      val date = s.substring(0, 8)
      val hour = s.substring(8, 10)
      val min = s.substring(10, 12)
      val second = s.substring(12, 14)
      date + " " + hour + " " + min + " " + second
    }
  }
}
