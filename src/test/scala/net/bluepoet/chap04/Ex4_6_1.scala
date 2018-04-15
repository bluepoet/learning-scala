package net.bluepoet.chap04

import org.scalatest.FlatSpec

class Ex4_6_1 extends FlatSpec {
  it should "two offset distance" in {
    val x = (1, 5)
    val y = (100, 2)

    assert(distance(x, y) == (99, -3))
  }

  def distance(x: (Int, Int), y:(Int, Int)): (Int, Int) ={
    (y._1 - x._1, y._2 - x._2)
  }
}
