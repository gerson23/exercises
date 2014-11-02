object ServiceLane {
  def main(args: Array[String]) {
    val Array(n,t) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
    val widthArray = scala.io.StdIn.readLine.split(" ").map(_.toInt)

    var _ = 0
    for(_ <- 0 until t) {
      val Array(i,j) = scala.io.StdIn.readLine.split(" ").map(_.toInt)
      println("calculation for (" + i + "," + j + ")")
    }
  }
}
