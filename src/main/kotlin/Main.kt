
fun imprimirVelas(edad:Int){
    println(",".repeat(edad))
    println("|".repeat(edad))
}

fun imprimirCapaSup(edad: Int){
    println("=".repeat(edad))
}

fun imprimirCapasInf(edad: Int,capas:Int){
    repeat(capas){ println("@".repeat(edad)) }
}

fun imprimirMensaje(mensaje:String, edad:Int){
    val espaciosBlancos = (edad - mensaje.length)/2
    var bandera = ""
    while (bandera.length < (mensaje.length + espaciosBlancos*2)){ bandera += ("\"-._.-\"") }
    println(bandera)
    println(" ".repeat(espaciosBlancos) + mensaje + " ".repeat(espaciosBlancos))
    println(bandera)

}




fun main() {
    val mensaje:String
    val edad:Int
    val capas:Int
    println("Introduce la edad")
    try{
        edad = readLine()?.toInt() ?: 0
    } catch (_:Exception) { println("La edad se introdujo de forma incorrecta."); return }
    println("Introduce el mensaje")
    mensaje = readLine() ?:""
    println("Introduce las capas de la tarta")
    try{
        capas = readLine()?.toInt() ?: 0
    } catch (_:Exception) { println("Las capas se introdujo de forma incorrecta."); return }
    if(edad in 1..98 && capas>0) {
        print("\n")
        imprimirMensaje(mensaje,edad)
        print("\n")
        imprimirVelas(edad)
        imprimirCapaSup(edad)
        imprimirCapasInf(edad,capas)
        print("\n")
        imprimirMensaje(mensaje,edad)
    } else {
        if(edad !in 1..98) println("La edad está fuera del rango permitido.")
        if(edad <= 0) println("Las capas n  o pueden ser 0 o menor de 0.")
    }

}