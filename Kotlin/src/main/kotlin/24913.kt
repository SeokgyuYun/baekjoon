import java.util.Scanner
import kotlin.math.ceil
import kotlin.math.max

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val q = sc.nextInt()
    val vote = Array(n + 1) { 0 }
    var sum = 0
    var max = 0
    var a: Int
    var b: Int
    var c: Int
    var y: Double

    for (i in 0 until q) {
        a = sc.nextInt()
        b = sc.nextInt()
        c = sc.nextInt()
        if (a == 1) {
            vote[c - 1] += b
            if (c - 1 != n) {
                max = max(max, vote[c - 1])
                sum += b
            }
        } else {
            if (c > max * n - sum) {
                c -= max * n - sum
                y = ceil(c.toDouble() / n)
            }
            else
                y = 0.0

            println(if (vote[n] + b > max + y) "YES" else "NO")
        }
    }
}