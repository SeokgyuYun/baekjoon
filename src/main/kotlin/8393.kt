import java.util.Scanner

fun main(args: Array<String>) {
    val sc : Scanner = Scanner(System.`in`)
    var n = sc.nextInt()
    var sum = 0
    for (i in 1..n) {
        sum += i
    }
    print(sum)
}