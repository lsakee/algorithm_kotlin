package Que

import java.util.*
import kotlin.collections.ArrayDeque

fun main() = with(System.`in`.bufferedReader()) {
    val inputNum = readLine()
    val que: Queue<Int> = LinkedList<Int>()
    val deque = ArrayDeque<Int>()
    for (i in 1..inputNum.toInt()) {
        que.add(i)
        deque.add(i)
    }

    while (deque.size != 1) {
        deque.removeFirst()
        val a = deque.removeFirst()
        deque.addLast(a)

    }
    println(deque[0])
}