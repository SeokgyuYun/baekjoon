import java.util.Scanner
fun main() {
    val sc = Scanner(System.`in`)
    var n = sc.nextInt()
    if (n == 0) println(1)
    else {
        for (i in 1 until n) n *= i
        println(n)
    }
}