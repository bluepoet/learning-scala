package net.bluepoet.chap03

import org.scalatest.FlatSpec

class MatchExpressionTest extends FlatSpec {
  "whildcard " should "not match case" in {
    val status = 404

    val result = status match {
      case 200 => "ok"
      case 500 => "server error"
      case _ => "other all case"
    }

    assert(result == "other all case")
  }
}
