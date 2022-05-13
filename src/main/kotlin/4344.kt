import java.util.Scanner

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    var n = sc.nextInt()
    var c: Int
    var cnt = 0.0
    var mutableList = mutableListOf<Int>()
    var sum = 0.0
    for (i in 0 until  n) {
        c = sc.nextInt()
        for (i in 0 until c) {
            mutableList.add(sc.nextInt())
            sum += mutableList[i]
        }
        for (i in 0 until c) {
            if (mutableList[i] > sum / c) {
                cnt++
            }
        }
        println(String.format("%.3f%%", cnt / c * 100))
        mutableList.clear()
        sum = 0.0
        cnt = 0.0
    }

}