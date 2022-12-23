import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    var n = sc.nextInt()
    val list = mutableListOf<Int>()
    var cnt = 0
    for (i in 0 until n) {
        list.add(sc.nextInt())
    }
    val x = sc.nextInt()
    list.sort()
    var a = 0
    var b = n - 1
    while (--n > 0) {
        if (list[a] + list[b] > x) b--
        else if (list[a] + list[b] < x) a++
        else if (list[a] + list[b] == x) {
            a++
            cnt++
        }
    }
    println(cnt)
}