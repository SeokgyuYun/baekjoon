import java.util.*

fun main(args: Array<String>) {
    val sc = Scanner(System.`in`)
    while (sc.hasNextInt()) { //hasNextInt() == 입력값이 Int일때만 리턴
        val a = sc.nextInt()
        val b = sc.nextInt()
        println(a + b)
    }
}