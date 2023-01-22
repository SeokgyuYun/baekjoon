import java.io.BufferedReader
import java.io.InputStreamReader
import java.util.LinkedList
import java.util.Queue

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {
    val n = readLine().toInt()
    val queue: Queue<Int> = LinkedList()

    for(i in 0 until  n){
        val s = readLine().split(" ")
        when(s[0]){
            "push" -> queue.offer(s[1].toInt())
            "pop" -> println(if (queue.isEmpty()) -1 else queue.poll())
            "size" -> println(queue.size)
            "empty" -> println(if (queue.isEmpty()) 1 else 0)
            "front" -> println(if (queue.isEmpty()) -1 else queue.element())
            "back" -> println(if (queue.isEmpty()) -1 else queue.last())
        }
    }
}