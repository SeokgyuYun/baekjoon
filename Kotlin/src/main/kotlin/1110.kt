import java.util.Scanner

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    var n = sc.nextInt()
    var t = n
    var cnt = 0
    var a: Int
    var b: Int
    do {
        a = n % 10
        n /= 10;
        b = (a + n) % 10
        n = a * 10 + b
        cnt++
    } while (t != n)
    print(cnt)
}