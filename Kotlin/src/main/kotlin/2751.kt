import java.lang.StringBuilder
import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val sb = StringBuilder()
    val sort = mutableSetOf<Int>()
    for (i in 0 until nextInt()) sort.add(nextInt())
    sort.sorted().forEach {
        sb.append(it).append('\n')
    }
    print(sb)
}