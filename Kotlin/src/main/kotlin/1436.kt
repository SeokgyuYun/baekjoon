fun main() = with(System.`in`.bufferedReader()) {
    val br = System.out.bufferedWriter()
    var n = readLine().toInt()
    var num = 665

    while (n > 0) {
        if ((++num).toString().contains("666"))
            n--
    }

    br.write("$num")
    br.flush()
    br.close()
}