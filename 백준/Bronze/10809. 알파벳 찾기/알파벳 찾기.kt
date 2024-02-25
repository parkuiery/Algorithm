fun main() {
    val str = readln()


    for (j in 'a'..'z') {
        var isContain = false
        for (i in str) {
            if(j == i) {
                isContain = true
                print("${str.indexOf(i)} ")
                break
            }
        }
        if(!isContain) print("-1 ")
    }
}