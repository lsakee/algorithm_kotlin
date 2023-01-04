package graph

import java.io.InputStreamReader
import kotlin.math.pow

fun main() = with(InputStreamReader(System.`in`)) {
    val (A, P) = readLine()!!.split(" ").map { it.toInt() }
    val visit = mutableListOf<Int>()
    val result = mutableListOf<Int>()
    dfsSeq(A, P, visit,result)
    println(result[0])
}

private fun makeSequence(A: Int, P: Int): Int {
    var b = 0
    for (j in A.toString()) {
        val a: Double = (j.digitToInt().toDouble()).pow(P)
        b = (b + a).toInt()
    }
    return b
}

fun dfsSeq(start: Int, P: Int, visit: MutableList<Int>,result:MutableList<Int>):MutableList<Int> {
    visit.add(start)
    var b = 0
    while (true) {
        val newStart = makeSequence(start, P)
        if (!visit.contains(newStart)) dfsSeq(newStart, P, visit,result)
        else {
            b=visit.indexOf(newStart)
            result.add(b)
            break
        }
    }
    return result
}
