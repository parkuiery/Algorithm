import java.util.*

fun main() {
    val stack = Stack<Int>()
    
    val n = readln().toInt()
    for(i in 1..n) {
        when(val s = readln()) {
            "pop" -> println(if(stack.size == 0) -1 else stack.pop())
            "size" -> println(stack.size)
            "empty" -> println(stack.isEmpty().toInt())
            "top" -> println(if(stack.size == 0) -1 else stack.peek())
            else -> stack.push(s.split(" ").last().toInt())
        }
    }
}

fun Boolean.toInt() = if (this) 1 else 0