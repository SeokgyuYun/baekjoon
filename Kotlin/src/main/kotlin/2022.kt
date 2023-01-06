import java.util.Scanner
import kotlin.math.min
import kotlin.math.sqrt

fun main() = with(Scanner(System.`in`)) {
    val x = nextDouble()
    val y = nextDouble()
    val c = nextDouble()

    var left = 0.0
    var right = min(x, y)

    while (right - left >= 0.001) {
        val width = (left + right) / 2
        val h1 = sqrt(x * x - width * width)
        val h2 = sqrt(y * y - width * width)
        if ((h1 * h2) / (h1 + h2) >= c) left = width
        else right = width
    }
    println(right)
}