import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    var n = next()
    var flag = 0
    while (n != "0") {
        for (i in 0 until n.length / 2) {
            if (n[i] == n[n.length - i - 1])
                flag++
        }
        println(if (flag == n.length / 2) "yes" else "no")
        flag = 0
        n = next()
    }
}