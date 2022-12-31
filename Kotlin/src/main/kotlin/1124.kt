import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val a = nextInt()
    val b = nextInt()
    val prime = BooleanArray(1000001) { true }
    var underPrime = 0
    for (i in 2..1000000) {
        if (prime[i]) {
            for (j in i * 2..1000000 step i) {
                prime[j] = false
            }
        }
    }
    for (i in a..b) {
        var c = i
        var t = 2
        var cnt = 0
        while (c > 1) {
            if (c % t == 0) {
                c /= t
                cnt++
            }
            else t++
        }
        if (prime[cnt] && cnt > 1) underPrime++
    }
    println(underPrime)
}