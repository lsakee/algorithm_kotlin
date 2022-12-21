package stack.Stack

import java.util.*

fun main() {///
    val num = readLine()
    val stacklist = Stack<String>()
    val stackcommendlist = mutableListOf<String>()
    if (num != null) {
        for (i in 1..num.toInt()) {
            val InputStack = readLine()
            stackcommendlist.add(InputStack.toString())

        }
    }
    for (i in stackcommendlist) {

        if (i.contains("push")) {
            stacklist.push(i.replace("push", "").replace(" ", ""))
        }
        if (i.contains("pop")) {
            if (stacklist.isEmpty()) {
                println("-1")
            } else {
                val b = stacklist.pop()
                println(b)
            }
        }
        if (i.contains("size")) {
            println(stacklist.size)
        }
        if (i.contains("empty")) {
            if (stacklist.isEmpty()) {
                println("1")
            } else {
                println("0")
            }
        }
        if (i.contains("top")) {

            if (stacklist.isEmpty()) {
                println("-1")
            } else {
                val e = stacklist.peek()
                println(e)
            }
        }
    }
}