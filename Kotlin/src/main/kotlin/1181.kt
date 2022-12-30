import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val word = mutableSetOf<String>()
    for (i in 0 until nextInt()) {
        word.add(next())
    }
    word.sortedWith(compareBy<String> { it.length }.thenBy { it }).forEach { println(it) }
}