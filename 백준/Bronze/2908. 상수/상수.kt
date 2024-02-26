fun main() {
    val (a:String, b: String) = readln().split(" ")
    if(a.reversed().toInt() > b.reversed().toInt()) println(a.reversed()) else println(b.reversed())
}