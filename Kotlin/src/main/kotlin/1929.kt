import java.util.Scanner
import kotlin.math.sqrt

fun main() = with(Scanner(System.`in`)) {
    val m = nextInt()
    val n = nextInt()
    val prime = BooleanArray(1000000) { true }
    for (i in m..n) {
        for (j in 2..sqrt(i.toDouble()).toInt()) {
            if (i % j == 0) {
                prime[i] = false
                break
            }
        }
    }

    for (i in m..n) {
        if (prime[i] && i != 1) println(i)
    }
}