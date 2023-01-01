import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var cnt = 0
    next().forEach {
        cnt += if (it in 'a'..'z') it - 'a' + 1 else it - 'A' + 27
    }
    println(if (isPrime(cnt)) "It is a prime word." else "It is not a prime word.")
}

private fun isPrime(n: Int): Boolean {
    for (i in 2 until n) {
        if (n % i == 0) return false
    }
    return true
}