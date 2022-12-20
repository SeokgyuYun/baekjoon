import java.util.*

fun main(args: Array<String>) {
    val sc : Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    println(a * (b % 10))
    println(a * ((b / 10) - ((b/100) * 10)))
    println(a * (b/ 100))
    println(a * b)
}