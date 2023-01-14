package graph.Boj_24479

fun main() {
// 정답이 맞아도 메모리초과가 떳다 수정을 계속하다보니 다시 원점...
    val (vertex, line, start) = readLine()!!.split(" ").map { it.toInt() }
    val graph = Array(vertex + 1) { Array(vertex + 1) { 0 } }
    val visit = mutableListOf<Int>()
    for (i in 0..vertex){
        visit.add(0)
    }
    connectLine(line, graph)
    dfs(start, graph, visit)
    println(visit)
}

private fun connectLine(line: Int, graph: Array<Array<Int>>) {
    repeat(line) {
        val (u, v) = readLine()!!.split(" ").map { it.toInt() }
        graph[u][v] = 1
        graph[v][u] = 1
    }
}

private fun dfs(start: Int, graph: Array<Array<Int>>, visit: MutableList<Int>) {
    visit.add(start)
    for (i in 1 until graph.size) {
        if (!visit.contains(i) && graph[i][start] == 1) {
            dfs(i, graph, visit)
        }
    }

}