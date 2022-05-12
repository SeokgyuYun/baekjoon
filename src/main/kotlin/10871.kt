import java.util.*

fun main(args: Array<String>) {
    val sc : Scanner = Scanner(System.`in`)
    var n = sc.nextInt()
    var a = sc.nextInt()
    var arr = mutableListOf<Int>()
    for (i in 0 until n) {
        arr.add(sc.nextInt())
        if (arr[i] < a) {
            print("${arr[i]} ")
        }
    }
}