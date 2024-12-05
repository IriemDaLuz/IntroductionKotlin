import kotlin.random.Random

// Introducción a Kotlin

fun main() {
    // >>> Declaración de variables <<<
    var nombre = "Carlos"
    println("Mi nombre es $nombre.")

    val ciudad = "Madrid"
    println("Vivo en $ciudad.")

    // >>> Tipos de datos <<<
    val numeroEntero: Int = 250
    val numeroDecimal: Double = 3.14
    val numeroLargo: Long = 987654321098765432
    val caracter: Char = 'z'
    val cadena: String = "Aprendiendo Kotlin"
    val boolean: Boolean = false

    // println imprime en una nueva línea. El $ se usa para introducir las variables.
    println("Entero: $numeroEntero, Decimal: $numeroDecimal, Num largo: $numeroLargo, Carácter: $caracter, Cadena: $cadena, Boolean: $boolean")

    // >>> If - Else if - Else <<<
    val edad = 16
    if (edad == 0) {
        println("Eres un recién nacido.")
    } else if (edad < 18) {
        println("Aún no eres adulto.")
    } else {
        println("Ya eres mayor de edad.")
    }

    // >>> When (similar a switch en otros lenguajes) <<<
    val dia = 2
    val mensaje = when {
        dia == 1 -> "Lunes: ¡A comenzar la semana!"
        dia in 2..4 -> "Es mitad de semana."
        dia == 5 -> "Viernes: ¡Por fin es el fin de semana!"
        dia == 6 || dia == 7 -> "Fin de semana."
        else -> "Día no reconocido."
    }
    println(mensaje)

    // >>> Declaración de lista mutable <<<
    var miLista = mutableListOf<Int>(6, 7, 8, 9, 10)

    // >>> Declaración de lista inmutable <<<
    var otraLista = listOf(6, 7, 8, 9, 10)

    // >>> Bucles <<<
    // For
    // Recorrer un rango
    for (i in 10..15) {
        println("Item $i")
    }

    // Recorrer un iterable
    for (i in miLista) {
        println("Elemento: $i")
    }

    // While
    var contador = 5
    while (contador > 0) {
        println("Quedan $contador intentos.")
        contador--
    }

    // >>> Listas <<<
    val listaMutable = mutableListOf(100, 200, 300, 400, 500)
    listaMutable.add(600)
    println("Lista mutable: $listaMutable")

    val listaInmutable = listOf("Perro", "Gato", "Conejo")
    println("Lista inmutable: $listaInmutable")

    // Operaciones con listas
    val numeros = listOf(10, 20, 30, 40, 50)
    val numerosImpares = numeros.filter { it % 2 != 0 }
    println("Números: $numeros")
    println("Números impares: $numerosImpares")

    // >>> Seguridad por posibles valores nulos (Null Safety) <<<
    // El '?' maneja la posibilidad de que un valor sea nulo para evitar errores de ejecución.
    var nombreNulo: String? = null
    println("Nombre nulo: ${nombreNulo ?: "Sin datos disponibles"}")

    // >>> Clases y Data Class <<<
    // Clase
    class Personita(val nombre: String, var edad: Int) {
        // Método que imprime información sobre el objeto
        fun informacion() {
            println("Nombre: $nombre, Edad: $edad años")
        }
    }

    // Crear objeto de una clase
    val persona = Personita("María", 22)
    persona.informacion()

    // Dataclass
    data class Persona(val nombre: String, var edad: Int)

    val persona1 = Persona("Laura", 35)
    val persona2 = Persona("Diego", 28)
    println("Persona 1: $persona1")
    println("Persona 2: $persona2")

    // Comparación de datos
    println("¿Son iguales las personas? ${persona1 == persona2}")

    // Copia con modificaciones
    val persona3 = persona1.copy(edad = 30)
    println("Persona 3: $persona3")

    // >>> Funciones <<<
    fun suma(a: Int, b: Int): Int {
        return a + b
    }

    // Función en una línea
    fun resta(a: Int, b: Int) = a - b

    println("Suma de 15 y 10 es: ${suma(15, 10)}")
    println("Resta de 20 y 8 es: ${resta(20, 8)}")

    // Función con valor por defecto
    fun saludar(nombre: String = "Invitado") = println("¡Hola, $nombre!")
    saludar()
    saludar("Pedro")
}
