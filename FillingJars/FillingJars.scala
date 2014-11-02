object Solution {

    def main(args: Array[String]) {
      val Array(n, m) = scala.io.StdIn.readLine().split(" ").map(_.toLong)
      var _ = 0
      var total: Double = 0.0

      for(_ <- 0 until m.toInt) {
        val Array(a, b, k) = scala.io.StdIn.readLine().split(" ").map(_.toLong)
        total += (b-a+1)*k
      }
      val res = scala.math.floor(total / n).toLong
      println(res)
    }
}
