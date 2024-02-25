import java.io.BufferedReader
import java.io.InputStreamReader

fun main() = with(BufferedReader(InputStreamReader(System.`in`))) {

    val t = readln().toInt()

    repeat(t) {
        val (r: String, str: String) = readLine()
            .split(" ")
        var res = ""

        for (c in str) {
            repeat(r.toInt()) {
                res += c
            }
        }
        println(res)
    }
}
