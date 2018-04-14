package net.bluepoet.chap03

object Ex4 {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 100) {
      i match {
        case i if i % 5 == 0 => print(i + "\n")
        case other => print(i +", ")
      }
    }
  }
}
