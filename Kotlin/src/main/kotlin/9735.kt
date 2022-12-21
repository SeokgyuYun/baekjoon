import java.util.Scanner
import kotlin.math.pow
import kotlin.math.sqrt

fun main() {
    val sc = Scanner(System.`in`)
    var n = sc.nextInt()
    for (i in 0 until n) {
        var a = sc.nextInt().toDouble()
        var b = sc.nextInt().toDouble()
        var c = sc.nextInt().toDouble()
        var d = sc.nextInt().toDouble()
        val x = find(a, b, c, d)
        if (x == 0.0) println(x)
        else {
            val b1 = b
            val c1 = c
            b = a
            c = b1 + (b * x)
            d = c1 + (c * x)
            if (c.pow(2) - 4 * b * d == 0.0) {
                var list = listOf(x, (-c) / (2 * b))
                println("${list[0]} ${list[1]}")
            } else {
                val x1 = (-c - sqrt(c.pow(2) - 4 * b * d)) / (2 * b)
                val x2 = (-c + sqrt(c.pow(2) - 4 * b * d)) / (2 * b)
                var list = listOf(x, x1, x2)
                list = list.sorted()
                println("${list[0]} ${list[1]} ${list[2]}")
            }
        }
    }
}

fun find(a: Double, b: Double, c: Double, d:Double): Double {
    var x = 0.0
    var y = 0.0
    while (true) {
        if ((a * x.pow(3) + b * x.pow(2) + c * x + d).toInt() == 0) return x
        else if ((a * y.pow(3) + b * y.pow(2) + c * y + d).toInt() == 0) return y
        x++
        y--
    }
}