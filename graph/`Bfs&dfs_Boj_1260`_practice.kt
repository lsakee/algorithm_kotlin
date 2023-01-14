package graph

import java.io.InputStreamReader
import java.util.*

private var graph = Array(0) { Array(0) { it -> 0 } }
private val visit = mutableListOf<Int>()

fun main() = with(InputStreamReader(System.`in`)) {

    val (vertex, lineCount, start) = readLine()!!.split(" ").map { it.toInt() }

    connectionLine(vertex,lineCount)

    dfs(start)
    println()
    visit.clear()
    bfs(start)
//    /**
    for (i in 0 until lineCount) {
    for ( j in 0 until lineCount) {
    print(graph[i][j])
    }
    println()
    }
//     **/
}

private fun connectionLine(vertex: Int, lineCount: Int) {
    graph = Array(vertex + 1) { Array(vertex + 1) { it -> 0 } }
    repeat(lineCount){
        val (line1, line2) = readLine()!!.split(" ").map { it.toInt() }
        graph[line1][line2] = 1
        graph[line2][line1] = 1
    }
}

private fun bfs(start: Int) {
    val queue: Queue<Int> = LinkedList()
    queue.add(start)
    visit.add(start)
    while (true) {
        val startNode = queue.poll()
        print("$startNode ")
        for (i in graph.indices) {
            if (!visit.contains(i) && graph[i][startNode] == 1 && graph[startNode][i] == 1) {
                queue.add(i)
                visit.add(i)
            }
        }
        if (queue.isEmpty()) break
    }
}

private fun dfs(start: Int) {
    visit.add(start)
    print("$start ")
    for (i in graph.indices) {
        if (!visit.contains(i) && graph[i][start] == 1 && graph[start][i] == 1) {
            dfs(i)
        }
    }
}
