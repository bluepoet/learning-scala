package net.bluepoet.chap02

object Ex6 {
  def main(args: Array[String]): Unit = {
    val s = "Frank,123 Main,925-555-1943,95122"
    val p = """.*,(\d{3})[ -]?(\d{3})[ -]?(\d{4}),.*""".r

    val p(m1, m2, m3) = s
    println(m1)
    println(m2)
    println(m3)

    val tuple = (m1.toInt, m2.toInt, m3.toInt)
    println(tuple)
  }
}
