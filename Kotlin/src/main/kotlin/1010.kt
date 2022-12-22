import java.util.Scanner

val arr = Array(30) { Array(30) {0} }
fun main() {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    for (i in 0 until t) {
        val n = sc.nextInt()
        val m = sc.nextInt()
        println(nCr(m, n))
    }
}
fun nCr(n: Int, r: Int): Int {
    if (arr[n][r] > 0) return arr[n][r]
    if (n == r || r == 0) {
        arr[n][r] = 1
        return arr[n][r]
    }
    arr[n][r] =  nCr(n - 1, r - 1) + nCr(n - 1, r)
    return arr[n][r]
}