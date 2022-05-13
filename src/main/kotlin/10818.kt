import java.util.Scanner

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    var mutableList = mutableListOf<Int>()
    var n = sc.nextInt()
    for (i in 0 until n) {
        mutableList.add(sc.nextInt())
    }
    mutableList.sort() // 리스트를 오름차순으로 정렬하는 함수
    print("${mutableList[0]} ${mutableList[n-1]}")
}