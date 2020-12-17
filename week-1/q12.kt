fun main(){
    var a:Int=1634//readLine()!!.toInt()
    if(isArmstrong(a)) println("$a is an Armstrong number.")
    else println("$a is not an Armstrong number.")

}

fun isArmstrong(a:Int):Boolean{
    var n = a
    var i = 1
    var d=numofDigits(a)
    var sum:Double=0.00
    while(i<=d){

        sum+=Math.pow(n.toDouble()%10.00,d.toDouble())
        n=n/10
        i++
    }
    if(sum==a.toDouble()) return true
    else return false

}

fun numofDigits(a:Int):Int{
    var n = a
    var d = 1
    while(n!=0){
        if (n/10!=0){
            d++
        }
        n=n/10
    }
    //print("$d")
    return d

}
