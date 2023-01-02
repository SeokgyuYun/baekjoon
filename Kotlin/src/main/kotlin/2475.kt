import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var n: Int
    var cnt = 0
    for (i in 0 until 5) {
        n = nextInt()
        cnt += n * n
    }
    println(cnt % 10)
}