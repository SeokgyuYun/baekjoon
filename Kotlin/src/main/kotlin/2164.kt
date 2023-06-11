import java.util.LinkedList
import java.util.Queue

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val n = readLine().toInt()
    val queue: Queue<Int> = LinkedList()

    for (i in 1..n) {
        queue.add(i)
    }

    while (queue.size > 1) {
        queue.remove()
        queue.add(queue.remove())
    }

    bw.write("${queue.element()}")
    bw.close()
}