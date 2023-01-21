import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    for (i in 0 until 3) {
        var result = 0.toBigInteger()

        for (j in 0 until nextInt())
            result += nextBigInteger()

        println( if (result < 0.toBigInteger()) "-" else if (result > 0.toBigInteger()) "+" else "0")
    }
}