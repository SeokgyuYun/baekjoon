import java.util.*
fun main(args: Array<String>) {
    val sc : Scanner = Scanner(System.`in`)
    var a = sc.nextInt()
    var b = sc.nextInt()
    when {
        a > b -> print(">")
        a < b -> print("<")
        else -> print("==")
    }
}