import java.util.Scanner
import kotlin.math.sqrt

fun main() {
    val sc = Scanner(System.`in`)
    val m = sc.nextInt()
    val n = sc.nextInt()
    var sum = 0
    var min = 100000
    val prime = BooleanArray(10001) {true}
    for (i in m..n) {
        for (j in 2..sqrt(i.toDouble()).toInt()) {
            if (i % j == 0) {
                prime[i] = false
                break
            }
        }
    }
    for (i in m..n) {
        if (prime[i] && i != 1) {
            sum += i
            if (min > i) min = i
        }
    }
    if (min == 100000) println(-1)
    else {
        println(sum)
        println(min)
    }
}