import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val k = nextInt()
    var t = 0
    val prime = BooleanArray(n + 1) { true }
    first@ for (i in 2..n) {
        for (j in i..n step i) {
            if (prime[j]) {
                prime[j] = false
                t++
                if (t == k) {
                    println(j)
                    break@first
                }
            }
        }
    }
}