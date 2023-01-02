import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = mutableListOf<Int>()
    var ascending = 0
    var descending = 0
    for (i in 0 until 8) n.add(nextInt())
    for (i in 1..8) {
        if (n[i-1] == i) ascending++
        else if (n[8-i] == i) descending++
    }
    if (descending == 8) println("descending")
    else if (ascending == 8) println("ascending")
    else println("mixed")
}