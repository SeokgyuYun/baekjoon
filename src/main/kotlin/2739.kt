import java.util.Scanner

fun main(args: Array<String>) {
    val sc : Scanner = Scanner(System.`in`)
    var n = sc.nextInt()
    var a = sc.nextInt()
    var b = sc.nextInt()
    for (i in 1..9) {
        println("$n * $i = ${n * i}")
    }
}