package Stack

import java.util.*

fun main(){

    val moneyCount= readLine()
    val money= Stack<Int>()
    for(i in 1 ..moneyCount!!.toInt()){
        val inputMoney= readLine()
        if (inputMoney!!.toInt()==0) money.pop()
        else money.push(inputMoney!!.toInt())
    }
    println(calculate(money))
}

fun calculate(money:Stack<Int>):Int{
    var moneyAll=0
    for(i in money)
        moneyAll+=i
    return moneyAll
}