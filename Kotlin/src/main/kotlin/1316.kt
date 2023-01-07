import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    var cnt = n
    for (i in 0 until n) {
        val str = next()
        val s = mutableSetOf<Char>()
        var t = ' '
        var check = true

        str.forEach {
            if (t != it) {
                t = it
                if (s.add(it).not()) {
                    check = false
                    return@forEach
                }
            }
        }
        if (check.not()) cnt--
    }
    println(cnt)
}