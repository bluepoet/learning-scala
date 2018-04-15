package net.bluepoet.chap04

import org.scalatest.FlatSpec

class Ex4_7_1 extends FlatSpec {
  it should "find int tuple attribue and sort first" in {
    val a = ("a", 1)

    assert(findIntAndFirstSort(a) == (1, "a"))
  }

  def findIntAndFirstSort[A, B](a: (A, B)): (Any, Any) = {
    if(a._2.isInstanceOf[Int]) (a._2, a._1)
    else a
  }
}
