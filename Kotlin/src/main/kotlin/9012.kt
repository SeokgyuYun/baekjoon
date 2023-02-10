import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    var way = 0
    for (i in 1..n) {
        for (j in i..n) {
            if (i + j == n) {
                println("$i + $j = ${i + j}")
                way++
            }
        }
    }
    println(way)
}