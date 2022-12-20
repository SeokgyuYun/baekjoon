import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    for (i in 0 until  a) {
        val n = sc.nextInt()
        var sum = 0
        for (j in 1 until n)
            if (n % j == 0) sum += j

        when {
            n > sum -> println("$n is a deficient number.")
            n == sum -> println("$n is a perfect number.")
            else -> println("$n is an abundant number.")
        }

        println()
    }
}