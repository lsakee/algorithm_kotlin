package Stack

import java.util.*

fun main() = with(System.`in`.bufferedReader()) {

    val num = readLine()
    val sequence = Stack<Int>()
    val result = mutableListOf<Int>()
    val checkResult = mutableListOf<Int>()
    val resultStr= mutableListOf<String>()
    var max = 0
    for (i in 1..num!!.toInt()) {
        val sequenceNum = readLine().toInt()
        checkResult.add(sequenceNum)

        if (sequenceNum > max) {
            for (i in max + 1..sequenceNum) {
                sequence.push(i)
                resultStr.add("+")
            }
            max = sequenceNum
            result.add(sequence.pop())
            resultStr.add("-")
        } else if (sequence.isNotEmpty() && sequence.peek() == sequenceNum) {
            result.add(sequence.pop())
            resultStr.add("-")
        }

    }
    if (checkResult.size==result.size){
        resultStr
            .forEach { println(it) }
    }else{
        println("NO")
    }

}

/*
*= with(System.`in`.bufferedReader()) !! 안써도됨
* 43687521
*  1 1234
* 1 2 5
* 12543
* */