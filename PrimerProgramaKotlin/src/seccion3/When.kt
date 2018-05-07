package seccion3

fun main(args : Array<String>){
    val x = 10

    when (x){
        1-> println("el valor vale 1 ")
        2-> println("vale 2")
        in 9..12 -> println("valor entre 9 y 12")
        else -> println("está fuera")
    }
}