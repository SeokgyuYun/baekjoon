import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val arr1 = mutableSetOf<Long>()
    val arr2 = mutableListOf<Long>()

    for (i in 0 until nextInt()) arr1.add(nextLong())
    for (i in 0 until nextInt()) arr2.add(nextLong())

    arr2.forEach { println(if (arr1.contains(it)) 1 else 0) }
}