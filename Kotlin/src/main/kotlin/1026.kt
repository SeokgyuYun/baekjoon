import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val a = mutableListOf<Int>()
    val b = mutableListOf<Int>()
    var s = 0
    for (i in 0 until n) a.add(sc.nextInt())
    for (i in 0 until n) b.add(sc.nextInt())
    a.sort()
    b.sort()
    for (i in 0 until n) s += a[i] * b[n - i - 1]
    print(s)
}