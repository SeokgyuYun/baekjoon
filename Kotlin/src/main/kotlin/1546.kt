import java.util.Scanner

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    var n = sc.nextInt()
    var sum = 0.0
    var mutableList = mutableListOf<Int>()
    for (i in 0 until n) {
        mutableList.add(sc.nextInt())
        sum += mutableList[i]
    }
    mutableList.sort()
    var m = mutableList[n-1 ]
    print((sum / m * 100) / n)
}