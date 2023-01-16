import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    for (i in 1..n) {
        for (j in 0 until i) print("*");
        for (j in (n - i) * 2 downTo 1) print(" ")
        for (j in 0 until i) print("*")
        println()
    }
    for (i in n - 1 downTo 1) {
        for (j in 0 until i) print("*");
        for (j in (n - i) * 2 downTo 1) print(" ")
        for (j in 0 until i) print("*")
        println()
    }
}