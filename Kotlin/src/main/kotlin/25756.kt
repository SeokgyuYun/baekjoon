import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    var v = 0.0
    var cnt: Double
    for (i in 0 until n) {
        cnt = 1-(1-v)*(1-sc.nextDouble()/100)
        v = cnt
        println(v * 100)
    }
}