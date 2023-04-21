fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, k) = readLine().split(' ').map { it.toInt() }
    var result = 1

    repeat(k) {
        result = result * (n - it) / (it + 1)
    }
    bw.write(result.toString())
    bw.close()
}