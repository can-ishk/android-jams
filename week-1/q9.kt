fun main(){
    var n = 8 //readLine()!!.toInt()
    var sum = 0
    var k=1
    while(k<=n)
    {
        if(k % 2 == 0){
            sum+=k
        }
        k++
    }
    println("Sum of all even numbers till $n = $sum")
}
