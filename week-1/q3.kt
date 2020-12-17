fun main(){
    var x:Int=-8
    var m=abs(x)
    println("Absolute Value = $m")
}
fun abs(x:Int):Int{

    if (x<0){
       var t = -1 * x
        return t
    }
    else return x
}
