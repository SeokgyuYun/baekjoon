import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val n = sc.nextInt()
    val snow = mutableListOf<Int>()
    var count = 0

    for (i in 0 until n)
        snow.add(sc.nextInt())

    snow.sort()
    while (snow[n-1] > 0) {
        if (n > 1 && snow[n-2] > 0) {
            snow[n-1]--
            snow[n-2]--
            count++
        }
        else {
            snow[n-1]--
            count++
        }
        snow.sort()
    }


    println(if (count > 1440) -1 else count)
}