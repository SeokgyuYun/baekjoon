import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val x = nextInt()
    val y = nextInt()
    val w = nextInt()
    val h = nextInt()
    val result = arrayOf(x - 0, y - 0, w - x, h - y)
    println(result.min())
}