import java.util.*
import kotlin.math.abs
import kotlin.math.sqrt

fun main() = with(Scanner(System.`in`)) {
    for (i in 0 until nextInt()) {
        val a = nextLong()
        val b = nextLong()
        val c = nextLong()
        val d = nextLong()
        val x = mutableSetOf<Double>()
        val x1 = find(a, b, c, d)
        val A = a
        val B = b + A * x1
        val C = c + B * x1
        val D = B * B - 4 * A * C
        if (D < 0) x.add(x1)
        else if (D > 0) {
            val x2 = (-B + sqrt(B * B - 4 * A * C)) / (2 * A)
            val x3 = (-B - sqrt(B * B - 4 * A * C)) / (2 * A)
            x.add(x1)
            x.add(x2)
            x.add(x3)
        }
        else {
            val x2 = -B / (2 * A) + 0.0
            x.add(x1)
            x.add(x2)
        }
        x.sorted().forEach { print("$it ") }
        println()
    }
}

fun find(a: Long, b: Long, c: Long, d:Long): Double {
    for (i in 1..abs(d)) {
        if (d % i == 0L) {
            if (a * i * i * i + b * i * i + c * i + d == 0L) return i.toDouble()
            else if (-a * i * i * i + b * i * i -c * i + d == 0L) return -i.toDouble()
        }
    }
    return 0.0
}