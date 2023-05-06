package Greedy

fun main() {

    val a = readLine()!!.toInt()
    val mutableList = readLine()!!.split(" ").map { it.toInt() }.toMutableList()

    mutableList.sort()

    if(a % 2 == 0) println(mutableList[a/2-1])
    else println(mutableList[(a+1)/2-1])
}