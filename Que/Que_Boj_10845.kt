package Que

import java.util.Deque
import java.util.LinkedList
import java.util.Queue
import java.util.StringTokenizer

fun main() = with(System.`in`.bufferedReader()) {
    val num = readLine().toInt()
    val que: Queue<Int> = LinkedList<Int>()
    repeat(num) {
        val input = StringTokenizer(readLine())
        when (input.nextToken()) {
            "push" -> {
                que.add(input.nextToken().toInt())
            }
            "pop" -> {
                if (que.isNotEmpty()) println(que.poll())
                else
                    println("-1")
            }
            "size" -> {
                println(que.size)
            }
            "empty" -> {
                if (que.isEmpty()) println("1")
                else println("0")
            }
            "front" -> {
                if (que.isNotEmpty()) println(que.first())
                else println("-1")
            }
            "back" -> {
                if (que.isNotEmpty()) println(que.last())
                else println("-1")
            }
        }
    }

}


