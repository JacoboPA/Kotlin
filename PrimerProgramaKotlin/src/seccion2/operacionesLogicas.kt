package seccion2

fun main (args: Array<String>){
    println("primer número")
    var numero1 : Int = readLine()!!.toInt()

    println("segundo número")
    var numero2 : Int = readLine()!!.toInt()

    val res = numero1 + numero2

    println(res)
}