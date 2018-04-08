package net.bluepoet.chap02

object Naming {
  def main(args: Array[String]): Unit = {
    val π = 3.14159
    val $ = "USD dollor"
    val o_+! = "이것도 된다"

    //compile error
//    val a.b = 25
//    val [abc] = "test"
    val `a.b` = 25
    val `[abc]` = "test"

    println(π)
    println($)
    println(o_+!)
    println(`a.b`)
    println(`[abc]`)
  }
}
