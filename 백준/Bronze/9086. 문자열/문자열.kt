fun main() {
    val t = readln().toInt()

    for (i in 1..t) {
        val str = readln()
        print(str[0])
        println(str[str.length -1])
    }
}