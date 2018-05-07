package seccion1

fun main(args: Array<String>){
    val nombre : String?
    //al agregar la interrogación , podemos contemplar que ese tipo de dato pueda llegar a ser null.
    nombre = null
    print(nombre!!)
    //en cambio con !! obligamos a que esa variable/constante deba tener un valor.
}