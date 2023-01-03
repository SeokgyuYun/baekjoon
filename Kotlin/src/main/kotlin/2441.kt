import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    for (i in 0 until n) {
        for (j in 0 until i) print(" ")
        for (j in i until n) print("*")
        println()
    }
}