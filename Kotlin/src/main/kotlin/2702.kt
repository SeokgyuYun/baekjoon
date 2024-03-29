import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    for (i in 0 until n) {
        val a = sc.nextInt()
        val b = sc.nextInt()
        println("${a * b / gcd(a, b)} ${gcd(a, b)}")
    }
}
private fun gcd(a: Int, b:Int): Int = if(b != 0) gcd(b, a % b) else a