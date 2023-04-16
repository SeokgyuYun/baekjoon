fun main() = with(System.`in`.bufferedReader()) {
    val bw = System.out.bufferedWriter()

    val (a, b) = readLine().split(' ').map { it.toLong() }
    val gcd = gcd(a, b)

    for (i in 0 until gcd) {
        bw.write("1")
    }
    bw.close()
}

fun gcd(a: Long, b: Long): Long = if (b == 0L) a else gcd(b, a % b)