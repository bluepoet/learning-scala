package net.bluepoet.chap02

object StringEx {
  def main(args: Array[String]): Unit = {
    println("with bluepoet, \nhello everybody")

    val greeting = "hello"
    println(greeting == "hello")

    println(
      """this is
        |multiline.
      """.stripMargin)
    println("pi, using 355/113, is about " + 355 / 113f + ".")

    val approx = 355 / 113f
    val number_100 = 100
    println(s"pi, using 355/113, is about $approx. ${number_100} ${"100 " * 3}")

    val item = "apple"
    println(f"i wrote a new ${item}%.3s today")
    println(f"enjoying this ${item} ${355 / 113.0}%.4f times today")

    val input: String = "Enjoying this apple 3.1459 times today"
    val pattern = """.* apple ([\d.]+) .*""".r

    // 정규식패턴을 찾을 수 없을 땐 scala.MatchError 발생
    val pattern(amountText) = input
    println(amountText.toDouble)
  }
}
