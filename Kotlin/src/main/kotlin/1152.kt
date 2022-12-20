import java.util.Scanner

fun main(args: Array<String>) {
    val sc: Scanner = Scanner(System.`in`)
    var s = sc.nextLine()
    var cnt = 0
    for (i in 0 until s.length) {
        if (i != s.length-1)
            if (s[i] == ' ' && s[i+1] != ' ') cnt++
    }
    if ((s[0] != ' ' && s[s.length-1] != ' ') || (s[s.length-1] == ' ' && s[0] != ' ')) print(cnt+1)
    else print(cnt)
}