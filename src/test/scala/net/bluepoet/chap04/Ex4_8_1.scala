package net.bluepoet.chap04

import org.scalatest.FlatSpec

class Ex4_8_1 extends FlatSpec {
  it should "each type string copy in all attribute tuple" in {
    val result: (Int, String, Char, String, Boolean, String) = stringCopy((1, 'c', true))
    assert(result == (1, "1", 'c', "c", true, "true"))
  }

  def stringCopy[A, B, C](x: (A, B, C)): (A, String, B, String, C, String) = {
    (x._1, x._1.toString, x._2, x._2.toString, x._3, x._3.toString)
  }
}
