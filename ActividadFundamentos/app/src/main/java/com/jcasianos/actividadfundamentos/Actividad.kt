package com.jcasianos.actividadfundamentos
fun main(){
 //Idenficar el pasiente de la persona

    val PrimerNombre: String   = "Mario"
    val PrimerApellido: String  = "Gonzalez"
    var EdadPersona: Int   = 25
    var Nacionalidad: String = "Dominicana"
    var Estado = "soltero"
    var ResidenciaActual = "Nueva Jersey"
    var ComidaFavorita: String = "Pizza"
    var NumeroDeResidencia: Int = 52
    val Trabajo = "no posee"
    var ActividadesFavoritas = ("comer, jugar beisbol, pasar en familia ")
    val Servicios:String = "netflix"
    var EquipoFavorito: String = "Los Angeles Dodgers"
    var NumerodeVisitas: Int = 6
    var licencia: String ="Vencida"

    println(PrimerNombre)
    println(PrimerApellido)
    println(EdadPersona)
    println(Nacionalidad)
    println(Estado)
    println(ResidenciaActual)
    println(ComidaFavorita)
    println(NumeroDeResidencia)
    println(Trabajo)
    println(ActividadesFavoritas)
    println(Servicios)
    println(EquipoFavorito)
    println(NumerodeVisitas)
    println(licencia)

    fun obtenerSoloNombre(nombreCompleto: String): String {
        return nombreCompleto.split("KOTLIN").first()
        println(nombreCompleto)
    }

    fun saludar(nombre: String): String {
        return "¡Hola, $nombre! Bienvenido a la app."
    }

    val saludo = saludar("Carlos")
    println(saludo)  // Salida: ¡Hola, Carlos! Bienvenido a la app.

    fun sumar(a: Int, b: Int): Int {
        return a + b
    }

    val resultado = sumar(5, 7)
    println("La suma es: $resultado")  // Salida: La suma es: 12


    fun dividir(a: Double, b: Double): String {
        return if (b != 0.0) {
            val resultado = a / b
            "Resultado: $resultado"
        } else {
            "Error: No se puede dividir por cero"
        }
        fun multiplicar(a: Int, b: Int, c: Int): Int {
            return a * b * c
        }

        val resultado = multiplicar(2, 3, 4)
        println("El resultado es: $resultado")  // Salida: El resultado es: 24


    }


}