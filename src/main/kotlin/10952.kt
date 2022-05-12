import java.util.*

fun main(args: Array<String>) {
    val sc : Scanner = Scanner(System.`in`)
    var a: Int
    var b: Int
    while (true) {
        a = sc.nextInt()
        b = sc.nextInt()
        if (a == b && a == 0) break
        println(a + b)
    }
}