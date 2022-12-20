import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    for (i in 0 until n) {
        var a = sc.nextInt()
        var b = sc.nextInt()
        println("${a * b / gcd(a, b)} ${gcd(a, b)}")
    }
}
fun gcd(a: Int, b:Int): Int = if(b != 0) gcd(b, a % b) else a