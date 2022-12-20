import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val str = sc.next()
    var d = 0
    var k = 0
    var s = 0
    var h = 0
    str.forEach {
        if (it == 'D') d += 1
        if (it == 'K') k += d
        if (it == 'S') s += k
        if (it == 'H') h += s
    }
    print(h)
}