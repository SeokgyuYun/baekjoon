import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val arr = ArrayList<Int>()

    repeat(nextInt()) {
        nextInt().also {
            if (it == 0) arr.removeLast()
            else arr.add(it)
        }
    }
    println(arr.sum())
}