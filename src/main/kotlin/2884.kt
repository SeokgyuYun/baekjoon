import java.util.Scanner

fun main(args: Array<String>) {
    val sc : Scanner = Scanner(System.`in`)
    var h = sc.nextInt()
    var m = sc.nextInt()
    m -= 45
    if (m < 0) {
        h--
        m += 60
        if (h < 0) h = 23
    }
    print("$h $m")
}