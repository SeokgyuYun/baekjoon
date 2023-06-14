fun main() = with(System.`in`.bufferedReader()) {
    val br = System.out.bufferedWriter()
    val n = readLine().toInt()
    val memberList = arrayListOf<Pair<Int, String>>()

    repeat(n) {
        memberList.add(readLine().split(' ').run { Pair(first().toInt(), last()) })
    }
    memberList.sortedBy { it.first }.forEach { (age, name) ->
        br.write("$age $name\n")
    }
    br.close()
}