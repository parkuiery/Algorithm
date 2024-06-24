fun main() {

    var a = 0;
    var b = 0;
    fun fib(n: Int): Int {
        return if (n == 1 || n == 2) {
            a++
            1
        } else (fib(n - 1) + fib(n - 2))
    }

    fun fibonacci(n: Int) : Int{
        var array = Array(n+1, {0})
        array[1] =  1
        array[2] = 1
        for(i in 3..n) {
            b++
            array[i] = array[i-1] + array[i-2]
        }
        return array[n]
    }

    val n = readln().toInt()
    fib(n)
    fibonacci(n)
    print("$a $b")
}