import java.util.Scanner
import kotlin.math.*

// 1002번 터렛

fun main() {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    for (i in 0 until t) {
        var cnt = 0
        val x1 = sc.nextInt().toDouble()
        val y1 = sc.nextInt().toDouble()
        val r1 = sc.nextInt().toDouble()
        val x2 = sc.nextInt().toDouble()
        val y2 = sc.nextInt().toDouble()
        val r2 = sc.nextInt().toDouble()
        val d = hypot((x2 - x1), (y2 - y1))

        if (r1 > r2) {
            if (r1 - r2 < d && r1 + r2 > d) cnt += 2
            else if (r1 + r2 == d || r1 - r2 == d) cnt += 1
        }
        else {
            if (x1 == x2 && y1 == y2 && r1 == r2) cnt = -1
            else if (r2 - r1 < d && r2 + r1 > d) cnt += 2
            else if (r2 + r1 == d || r2 - r1 == d) cnt += 1
        }

        println(cnt)
    }
}