import java.util.Scanner

fun main(args: Array<String>) {
    val sc : Scanner = Scanner(System.`in`)
    var n = sc.nextInt()
    for (i in 1..n) {
        var a = sc.nextInt()
        var b = sc.nextInt()
        println(a + b)
    }
}