import java.util.Scanner

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    var a: Int
    var mutableSet = mutableSetOf<Int>()
    for (i in 0..9) {
        a = sc.nextInt()
        mutableSet.add(a % 42)
    }
    print(mutableSet.size)
}