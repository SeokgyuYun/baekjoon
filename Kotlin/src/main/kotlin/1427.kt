import java.util.*

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.next()
    val str = mutableListOf<Char>()
    for (i in n.indices) {
        str.add(n[i])
    }
    str.sort()
    str.reverse()
    for (i in n.indices) {
        print(str[i])
    }
}