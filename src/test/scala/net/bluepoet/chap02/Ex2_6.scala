package net.bluepoet.chap02

import org.scalatest.FlatSpec

class Ex2_6 extends FlatSpec {

  it should "sentence have a phone number" in {
    val s = "Frank,123 Main,925-555-1943,95122"
    val pattern = """.*,(\d{3})[ -](\d{3})[ -](\d{4}),.*""".r

    val pattern(p1, p2, p3) = s
    val result = (p1, p2, p3)

    assert(result._1.toInt == 925)
    assert(result._2.toInt == 555)
    assert(result._3.toInt == 1943)
  }
}
