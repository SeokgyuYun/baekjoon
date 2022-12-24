import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextLong()
    val b = sc.nextLong()
    val c = sc.nextLong()

    val result = square(a, b, c)
    println(result)
}

fun square(a: Long, b: Long, c: Long): Long = if (b > 1) {
    val result: Long = square(a, b / 2, c)
    if (b % 2 == 0L) (result * result) % c
    else ((result * result) % c * a) % c
} else a % c
