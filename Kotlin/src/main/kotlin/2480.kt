import java.util.Scanner

fun main(args: Array<String>) {
    val sc : Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    var c = sc.nextInt()
    when {
        a == b && b == c -> print(10000 + a * 1000)
        a == b -> print(1000 + a * 100)
        c == a -> print(1000 + c * 100)
        b == c -> print(1000 + b * 100)
        a > b && a > c -> print(a * 100)
        b > a && b > c -> print(b * 100)
        c > a && c > b -> print(c * 100)
    }
}