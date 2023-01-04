package graph

import java.io.InputStreamReader
import java.util.*

fun main() = with(InputStreamReader(System.`in`)) {

    val (top, line, start) = readLine()!!.split(" ").map { it.toInt() }
    /**
     * 2중배열 행 열 초기값 설정
     **/
    val graph = Array(top + 1) { IntArray(top + 1) { 0 } }
    val visit = mutableListOf<Int>()

    /**
    간선 연결 해주기**/
    makeLine(line, graph)

    dfs(start, graph, visit)
    for (i in visit) {
        print("$i ")
    }

    println()
    bfs(start, graph, visit)
    for (i in visit) {
        print("$i ")
    }
}

fun makeLine(line: Int, graph: Array<IntArray>) = with(System.`in`.bufferedReader()) {
    repeat(line) {
        val (line1, line2) = readLine().split(" ").map { it.toInt() }
        //연결된 노드들의 관계인 인덱스의 값을 1로 설정정
        graph[line1][line2] = 1
        graph[line2][line1] = 1
    }
}

fun dfs(start: Int, graph:Array<IntArray>, visit: MutableList<Int>){

    visit.add(start)
    for (newStart in 1 until graph.size) {
        if (!visit.contains(newStart) && graph[start][newStart] == 1)
            dfs(newStart, graph, visit)
    }
}

fun bfs(start: Int, graph: Array<IntArray>, visit: MutableList<Int>){
    val que: Queue<Int> = LinkedList<Int>()
    visit.clear()
    que.add(start)
    visit.add(start)
    while (true) {
        val a = que.poll()
        for (i in 1 until graph.size) {
            if (graph[a][i] == 1 && !visit.contains(i)) {
                que.add(i)
                visit.add(i)
            }
        }
        if (que.isEmpty()) break
    }
}
