import java.math.BigInteger
import java.util.*

fun main() = with(Scanner(System.`in`)) {
    var n: BigInteger
    for (i in 0 until nextInt()) {
        n = nextBigInteger()
        if (n.isProbablePrime(10)) println(n)
        else println(n.nextProbablePrime())
    }
}