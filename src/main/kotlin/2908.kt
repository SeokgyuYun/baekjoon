import java.util.Scanner

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    a = a/100 + a%100 - a%10 + a%10 * 100
    b = b/100 + b%100 - b%10 + b%10 * 100
    if (a > b) print(a)
    else print(b)
}