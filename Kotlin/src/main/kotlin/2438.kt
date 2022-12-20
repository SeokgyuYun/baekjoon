import java.util.*

fun main(args: Array<String>) {
    val sc : Scanner = Scanner(System.`in`)
    var n = sc.nextInt()
    for (i in 1..n) {
        for (j in 1..i) {
            print("*")
        }
        println()
    }
}