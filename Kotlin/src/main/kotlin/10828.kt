import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val stack = IntArray(n)
    var top = -1

    for(i in 0 until  n){
        val s = readLine().split(" ")
        when(s[0]){
            "push" -> stack[++top] = s[1].toInt()
            "pop" -> println(if (top == -1) -1 else stack[top--])
            "size" -> println(top + 1)
            "empty" -> println(if (top == -1) 1 else 0)
            "top" -> println(if (top == -1) -1 else stack[top])
        }
    }
}