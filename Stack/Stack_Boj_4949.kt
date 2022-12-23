package Stack

import java.util.*

fun main() {
    var b = ""
    val a = mutableListOf<String>()
    while (true) {
        b = readLine().toString()
        if (b.replace(".", "") == "") break
        a.add(b)
    }
    for (i in a) {
        calculateS(i)
    }
}

fun calculateS(p: String) {
    val ps = Stack<Char>()
    for (i in p) {

        if (i == '(' || i == '[') {
            ps.push(i)
        } else if (i == ')') {

            if (ps.isEmpty() || ps.peek() == '[') {
                println("no")
                return
            }
            val a = ps.pop()
            if (a == ')' || a == ']') {
                println("no")
                return
            }

        } else if (i == ']') {

            if (ps.isEmpty() || ps.peek() == '(') {
                println("no")
                return
            }
            val a = ps.pop()
            if (a == ')' || a == ']') {
                println("no")
                return
            }
        }
    }
    if (ps.isEmpty()) {
        println("yes")
    } else println("no")

}

