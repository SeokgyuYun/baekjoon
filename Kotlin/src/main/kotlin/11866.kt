import java.util.LinkedList
import java.util.Queue
import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val n = nextInt()
    val k = nextInt()
    val queue: Queue<Int> = LinkedList()

    for (i in 1..n) queue.add(i)

    print("<")
    for (i in 0 until n) {
        for (i in 0 until k - 1) queue.offer(queue.poll())

        print(if (queue.size == 1) "${queue.poll()}>" else "${queue.poll()}, ")
    }
}