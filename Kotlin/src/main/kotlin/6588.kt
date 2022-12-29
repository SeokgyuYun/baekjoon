import java.util.Scanner
import kotlin.math.sqrt

fun main() = with(Scanner(System.`in`)) {
    var n: Int
    var flag = true
    val prime = BooleanArray(1000001) { true }

    for (i in 2..1000000) {
        if (prime[i]) {
            for (j in i * 2..1000000 step i) {
                prime[j] = false
            }
        }
    }

    while (true) {
        n = nextInt()
        if (n == 0) break
        for (i in 3..n) {
            if (prime[i] && prime[n - i]) {
                println("$n = $i + ${n - i}")
                flag = false
                break
            }
        }
        if (flag) println("Goldbach's conjecture is wrong.")
        flag = true
    }
}