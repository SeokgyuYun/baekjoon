import java.util.Scanner

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    var mutableList = mutableListOf<Int>()
    var max = 0
    for (i in 0..8) {
        mutableList.add(sc.nextInt())
        if (max < mutableList[i]) max = mutableList[i]
    }
    for (i in 0..8) {
        if (max == mutableList[i]) {
            print("${mutableList[i]}\n${i+1}")
            break
        }
    }
}