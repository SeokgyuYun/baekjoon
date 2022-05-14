import java.util.Scanner

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    var n = sc.nextInt()
    var a = sc.next()
    var sum = 0
    for (i in 0 until n) {
        for (j in '0'..'9') {
            if (j == a[i]) {
                sum += j.toInt() - 48
            }
        }
    }
    print(sum)
}