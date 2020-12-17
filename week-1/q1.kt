fun main() {
    var x = arrayOf(26,-10,0,8,-1)
	for(k in x)
    {
        checkSign(k)
    }
}

fun checkSign(x:Int){
    if(x<0){
        println("$x is a negative integer.")
    }
    else println("$x is a positive integer.")
}
