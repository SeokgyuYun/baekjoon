import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val str = sc.next()
    var d: Long = 0
    var k: Long = 0
    var s: Long = 0
    var h: Long = 0
    str.forEach {
        if (it == 'D') d += 1
        if (it == 'K') k += d
        if (it == 'S') s += k
        if (it == 'H') h += s
    }
    print(h)
}