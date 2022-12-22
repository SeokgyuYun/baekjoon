import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextBigInteger()
    val m = sc.nextBigInteger()
    println(n / m)
    println(n % m)
}