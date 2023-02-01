import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    while (true) {
        val a = nextInt()
        val b = nextInt()
        if (a == 0 && b == 0) break
        println(if (a > b) "Yes" else "No")
    }
}