fun main() = with(System.`in`.bufferedReader()) {
    val br = System.out.bufferedWriter()

    val cards = arrayListOf<Int>()
    val (n, m) = readLine().split(' ').map { it.toInt() }
    var max = 0
    var sum: Int

    readLine().split(' ').forEach {
        cards.add(it.toInt())
    }
    for (i in 0 until n) {
        for (j in i + 1 until n) {
            for (k in j + 1 until n) {
                sum = cards[i] + cards[j] + cards[k]
                if (sum <= m && m - sum < m - max) {
                    max = sum
                }
            }
        }
    }

    br.write("$max")
    br.close()
}