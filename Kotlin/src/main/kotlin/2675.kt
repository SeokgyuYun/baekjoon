import java.util.Scanner

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    var n = sc.nextInt()
    var s: String
    var c: Int
    for (i in 0 until n) {
        c = sc.nextInt()
        s = sc.next()
        for (j in 0 until s.length) {
            for (k in 0 until c) {
                print(s[j])
            }
        }
        println()
    }
}