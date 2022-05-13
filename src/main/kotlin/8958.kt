import java.util.Scanner

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    var n = sc.nextInt()
    var str: String
    var sco = 0
    var plu = 0
    for (i in 0 until n) {
        str = sc.next()
        for (j in 0 until str.length) {
            if (str[j] == 'O') {
                plu++
                sco += plu
            }
            else plu = 0
        }
        println(sco)
        sco = 0
        plu = 0
    }
}