import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    for (i in 0 until n) {
        for (j in 0 until n - i - 1) print(" ")
        for (j in 0 .. 2 * i) print("*")
        println()
    }
}