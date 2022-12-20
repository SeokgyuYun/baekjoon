import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    for (i in 0 until n) {
        for (j in 0 until n-i) {
            print("*")
        }
        println()
    }
}