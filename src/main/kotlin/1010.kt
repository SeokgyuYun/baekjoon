import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    for (i in 0 until t) {
        val n = sc.nextInt()
        val m = sc.nextInt()
        println(nCr(n, m))
    }
}
fun fac(n: Int): Int {
    var result = 1
    for (i in 1..n) {
        result *= i
    }
    return result
}

fun nPr(n: Int, r: Int) = fac(n) / fac(n-r)

fun nCr(n: Int, r: Int) = nPr(n, r) / fac(r)