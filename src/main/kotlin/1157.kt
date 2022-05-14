import java.util.Scanner

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    var s = sc.next()
    var mutableList = MutableList(26, {0})
    s = s.uppercase()
    for (i in 0 until s.length)
        for (j in 0..25)
            if (s[i].toInt() == j + 65)
                mutableList[j]++
    var max = 0
    var max_num = 0
    for (i in 0 until 26) {
        if (mutableList[i] > max) {
            max = mutableList[i]
            max_num = i
        }
    }
    var cnt = 0
    for (i in 0 until 26)
        if (mutableList[i] == max) cnt++
    if (cnt > 1) print("?")
    else print((max_num + 65).toChar())
}

