fun main() = with(System.`in`.bufferedReader()) {
    val br = System.out.bufferedWriter()

    val coordinates = arrayListOf<Pair<Int, Int>>().also { list ->
        repeat(readLine().toInt()) {
            readLine().split(' ').map { it.toInt() }.also { (x, y) ->
                list.add(Pair(x, y))
            }
        }
    }

    coordinates.sortedWith(compareBy({ it.first }, { it.second })).forEach {
        br.write("${it.first} ${it.second}\n")
    }

    br.flush()
    br.close()
}