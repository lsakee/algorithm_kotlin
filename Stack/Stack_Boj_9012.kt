package Stack

import java.util.*

fun main() {
    val num = readLine()
    for (i in 1..num!!.toInt()) {
        val p = readLine()
        calculate(p.toString())
    }
}
fun calculate(p:String){
    val ps = Stack<Char>()
for (i in p.toString()){

    if(i.toString()=="(") {
        ps.push(i)
    }
    else if(i.toString()==")"){
        if (ps.isEmpty()) {
            println("NO")
            return
        }
        if (ps.pop() == ')') {
            println("NO")
            return
        }
    }

}
    if(ps.isEmpty()){ println("YES")
    }else println("NO")
}