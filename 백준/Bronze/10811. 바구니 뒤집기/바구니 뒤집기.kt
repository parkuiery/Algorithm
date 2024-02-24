import java.util.*

fun main() {
    val s = Scanner(System.`in`)
    val a = s.next().toInt()
    val b = s.next().toInt()

    val data = ArrayList<Int>()

    for (i in 1..a) {
        data.add(i)
    }
    for (x in 1..b) {
        val i = s.next().toInt() -1
        val j = s.next().toInt() -1

        val new = ArrayList<Int>()
        var d = 0

        for (y in i..j) {
            new.add(data[y])
        }
        new.reverse()
        for (z in i..j) {
            data[z] = new[d++]
        }
    }
    data.forEach { value -> print("$value ") }
}
