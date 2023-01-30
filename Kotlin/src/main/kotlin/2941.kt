import java.util.Scanner

fun main() = with(Scanner(System.`in`)) {
    val alp = arrayOf("c=" ,"c-", "dz=", "d-", "lj", "nj", "s=", "z=")
    var s = next()

    alp.forEach { s = s.replace(it, " ") }
    println(s.length)
}