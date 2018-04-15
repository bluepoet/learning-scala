package net.bluepoet.chap04

import org.scalatest.FlatSpec

class Ex4_2 extends FlatSpec {
  it should "empty radius value is error" in {
    val radius = ""

    assertThrows[NumberFormatException] {
      val pi = 3.14
      pi * Math.pow(radius.toDouble, 2)
    }
  }
}
