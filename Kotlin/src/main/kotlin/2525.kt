import java.util.Scanner

fun main(args: Array<String>) {
    val sc : Scanner = Scanner(System.`in`)
    var h = sc.nextInt()
    var m = sc.nextInt()
    var n = sc.nextInt()
    m += n
    while (m >= 60) {
        m -= 60
        h++
        if (h == 24) h = 0
    }
    print("$h $m")
}