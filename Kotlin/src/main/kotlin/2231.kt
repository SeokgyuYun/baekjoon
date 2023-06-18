fun main() = with(System.`in`.bufferedReader()) {
    val br = System.out.bufferedWriter()
    val n = readLine().toInt()

    for (i in n / 2 until n) {
        if (n == i + "$i".sumOf { it - '0' }) {
            br.write("$i")
            br.flush()
            br.close()
            return
        }
    }
    br.write("0")
    br.flush()
    br.close()
}