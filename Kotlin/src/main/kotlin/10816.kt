fun main() = with(System.`in`.bufferedReader()) {
    val br = System.out.bufferedWriter()

    val cards = mutableMapOf<Int, Int>()

    val n = readLine().toInt()
    readLine().split(' ').map { it.toInt() }.forEach { card ->
        cards[card]?.let {
            cards[card] = cards[card]!! + 1
        } ?: cards.put(card, 1)
    }

    val m = readLine().toInt()
    readLine().split(' ').map { it.toInt() }.forEach { card ->
        br.write("${cards[card] ?: 0} ")
    }

    br.close()
}
