import java.util.Scanner

// 1009번 분산처리

fun main() {
    val sc = Scanner(System.`in`)
    val t = sc.nextInt()
    for (i in 0 until t) {
        val a = sc.nextInt()
        val b = sc.nextInt()
        var result = 1
        for (j in 1 .. b) result = result * a % 10
        if (result == 0) println(10)
        else println(result)
    }
}