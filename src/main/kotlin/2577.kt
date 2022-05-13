import java.util.Scanner

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    var arrayList = arrayListOf<Int>(0, 0, 0, 0, 0, 0, 0, 0, 0, 0)
    var a = sc.nextInt()
    var b = sc.nextInt()
    var c = sc.nextInt()
    var mul = a * b * c
    while (mul > 0) {
        arrayList[mul % 10]++
        mul /= 10
    }
    for (i in 0..9) println(arrayList[i])
}