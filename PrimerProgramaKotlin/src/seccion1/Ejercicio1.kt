package seccion1

fun main(args: Array<String>){
    println("introduce el primer número")
    var numerouno = readLine()
    var perimetro = numerouno!!.toInt() * 4
    println("el perimetro de $numerouno es=" + perimetro)
}