fun main(){
    var a:Int=153//readLine()!!.toInt()
    if(isArmstrong(a)) println("$a is an Armstrong number.")
    else println("$a is not an Armstrong number.")

}

fun isArmstrong(a:Int):Boolean{
    var h = a/100
    var t = (a%100)/10
    var o = (a%100)%10
    if ((h*h*h)+(t*t*t)+(o*o*o)==a) return true
    else return false
}
