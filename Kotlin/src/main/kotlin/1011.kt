import java.util.*
import kotlin.math.sqrt

fun main() {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    for (i in 0 until t) {
        val x = sc.nextInt()
        val y = sc.nextInt()
        val d = y - x
        val cnt = sqrt(d.toDouble()).toInt()

        val result = when {
            d == cnt * cnt -> cnt * 2 - 1
            d <= cnt * cnt + cnt -> cnt * 2
            else -> cnt * 2 + 1
        }
        println(result)
    }
}