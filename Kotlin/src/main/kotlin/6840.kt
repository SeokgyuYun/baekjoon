import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val (a, b, c) = arrayOf(nextInt(), nextInt(), nextInt())
    println(arrayOf(a, b, c).sorted()[1])
}