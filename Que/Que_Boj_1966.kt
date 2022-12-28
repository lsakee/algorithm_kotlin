package Que

import java.util.*
import kotlin.random.Random.Default.nextInt

data class Node(
    val index: Int,
    val value: Int
) : Comparable<Node> {
    override fun compareTo(other: Node): Int = other.value - value

}

fun main() = with(System.`in`.bufferedReader()) {
    val num = readLine().toInt()

    repeat(num) {
        val que = PriorityQueue<Node>()
        val a = customReadLine()
        val priority = customReadLine()
        for (i in 0 until a[0]) {
            que.add(Node(i, priority[i]))
            println(que)
        }

        var count = 0
        while (true) {
            val c = que.poll()

            println(que)

            if (a[1] == c.index) {
                println(count + 1)
                break
            } else count++

        }

    }

}


fun customReadLine(): List<Int> {
    return readLine()!!.split(" ").map { it.toInt() }
}