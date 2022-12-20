import java.util.Scanner

fun main(args: Array<String>) {
    val sc : Scanner = Scanner(System.`in`)
    var n = sc.nextInt()
    for (i in n downTo 1) {
        println(i)
    }
}