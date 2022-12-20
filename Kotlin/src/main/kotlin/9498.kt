import java.util.*

fun main(args: Array<String>) {
    val sc : Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    when (a) {
        in 90 .. 100 -> print("A")
        in 80 .. 89 -> print("B")
        in 70 .. 79 -> print("C")
        in 60 .. 69 -> print("D")
        else -> print("F")
    }
}