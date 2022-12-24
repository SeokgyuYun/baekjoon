import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    var a = sc.nextInt()
    val b = sc.nextInt()
    val n = sc.nextInt()
    a %= b
    for (i in 0 until n - 1) {
        a *= 10
        a %= b
    }
    println(a * 10 / b)
}