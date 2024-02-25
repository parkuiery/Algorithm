fun main() {
    val t = readln().toInt()
    val c = readln()
    var sum = 0
    for (i in 0..< t) {
        sum += Character.getNumericValue(c[i])
    }
    println(sum)
}