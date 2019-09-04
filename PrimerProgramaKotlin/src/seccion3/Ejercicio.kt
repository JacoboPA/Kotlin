package seccion3

fun main(args : Array<String>){
    println("ingresa un numero")
    val numero1 = readLine()!!.toInt()
    println("segundo numero")
    val numero2 = readLine()!!.toInt()

    if(numero1>numero2){
        val suma = numero1 + numero2
        println("suma =" + suma)
        val diferencia = numero1 - numero2
        println("diferencia = " + diferencia)
    }
    else{
        val producto = numero1 * numero2
        val division = numero1 / numero2
        println("producto =" + producto)
        println("division =" + division)
    }
}