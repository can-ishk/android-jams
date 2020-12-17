fun main(){
var a:Int=0
var b:Int=0
var c:Int=0
a=readLine()!!.toInt() // readLine() shows an NPE in Kotlin Playground
b=readLine()!!.toInt() // because this website doesn't have an interactive console.
c=readLine()!!.toInt() // Thus, readLine() returns a NULL value.
println("Enter Sides:")
if((a+b)>(c) && (b+c)>(a) && (a+c)>(b))
    {
        if(a.equals(b) and a.equals(c)) println("Equilateral.")
		else if (a.equals(b) or a.equals(c) or b.equals(c)) println("Isosceles.")
		else println("Scalene.")
    }
else println("Enter valid values.\nSum of the lenghts of any two sides of a triangle\nis always greater than the third side.")

}
