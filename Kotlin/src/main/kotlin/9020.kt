import java.util.*

fun main() = with(Scanner(System.`in`)) {
    val prime = BooleanArray(10001) { true }

    for (i in 2..10000) {
        if (prime[i]) {
            for (j in i * 2..10000 step i) {
                prime[j] = false
            }
        }
    }
    for (i in 0 until nextInt()) {
        val n = nextInt()
        var a = n / 2
        var b = n / 2
        while (true) {
            if (prime[a] && prime[b] && a + b == n) break
            a--
            b++
        }
        println("$a $b")
    }
}