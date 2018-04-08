package net.bluepoet.chap02

object OtherRefEx {
  def main(args: Array[String]): Unit = {
    var text: String = "text"
    text = null
    println(text == null)

    val nullRef: Null = null
    tryit(nullRef)

    // else 절은 Nothing 타입. Boolean타입에 할당 가능
//    val b: Boolean = if (1 > 2) false else throw new RuntimeException("error")

    val c: Char = 'A'

    println(c.toInt)
    println(116.toChar.isInstanceOf[Char])

    // 결과값 평가 전 두 인사 모두 검사
    println((5 != 6) & true)

    // 첫번째가 false이면 두번째 인수 평가 안함
    println(false && (5 < 6))

    println(().isInstanceOf[Unit])
  }

  def tryit(thing: Null): Unit = { println("that worked")}
}
