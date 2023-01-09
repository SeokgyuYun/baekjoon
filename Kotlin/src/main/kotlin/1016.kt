import java.util.Scanner
import kotlin.math.sqrt

fun main() = with(Scanner(System.`in`)) {
    val min = nextLong()
    val max = nextLong()
    val prime = BooleanArray((max - min + 1).toInt()) { false }

    for (i in 2..sqrt(max.toDouble()).toLong()) {
        var n = if (min % (i * i) == 0L) min / (i * i) else min / (i * i) + 1
        while (n * i * i <= max) {
            prime[(n * i * i - min).toInt()] = true
            n++
        }
    }
    var cnt = 0
    for (i in 0..(max - min).toInt()) {
        if (prime[i].not()) cnt++
    }
    println(cnt)
}