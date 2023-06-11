import java.util.Collections.min

fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()
    val (n, m) = readLine().split(' ').map { it.toInt() }

    val chessBoard = arrayListOf<String>()
    val minCount = arrayListOf<Int>()

    repeat(n) { chessBoard.add(readLine()) }

    for (i in 0 .. n - 8) {
        for (j in 0 .. m - 8) {
            var blackCount = 0
            var whiteCount = 0

            for (k in i until i + 8) {
                for (l in j until j + 8) {
                    if ((k + l) % 2 == 0) {
                        if (chessBoard[k][l] == 'B')
                            whiteCount++
                        else
                            blackCount++
                    } else {
                        if (chessBoard[k][l] == 'B')
                            blackCount++
                        else
                            whiteCount++
                    }
                }
            }

            minCount.add(whiteCount)
            minCount.add(blackCount)
        }
    }
    bw.write("${min(minCount)}")
    bw.close()
}
