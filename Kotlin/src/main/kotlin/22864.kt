import java.util.Scanner

fun main() {
    val sc = Scanner(System.`in`)
    val a = sc.nextInt()
    val b = sc.nextInt()
    val c = sc.nextInt()
    val m = sc.nextInt()
    var job = 0
    var fatigue = 0

    if (a > m) print(0)
    else {
        for (i in 0 until 24) {
            if (fatigue + a > m) {
                fatigue -= c
                if (fatigue < 0) fatigue = 0
            }
            else {
                job += b
                fatigue += a
            }
        }
        print(job)
    }
}