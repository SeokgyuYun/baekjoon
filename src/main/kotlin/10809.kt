import java.util.Scanner

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    var s = sc.next()
    var mutableList = MutableList(26, {-1})
    var mutableList2 = MutableList(26, {0})
    for (i in 0 until s.length) {
        for (j in 0..25) {
            if (s[i].toInt() == j + 97) {
                mutableList2[j]++
                if (mutableList2[j] >= 2) continue
                mutableList[j] = i
            }
        }
    }
    for (i in 0 until 26) {
        print("${mutableList[i]} ")
    }
}