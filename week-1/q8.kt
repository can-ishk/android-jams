fun main(){
    var a:Int=4//readLine()!!.toInt()
    var s = SumofFact(a)
    println("Sum of $a Factorials = $s")
}

fun fact(t:Int):Int{
    var p = t
    var f = 1
    while(p!=0)
    {
        f*=p--

    }
    return f
}
fun SumofFact(a:Int) : Int{
    var k = a
    var sum=0
    while(k!=0)
    {
        sum+=fact(k--)
    }
    return sum
}
