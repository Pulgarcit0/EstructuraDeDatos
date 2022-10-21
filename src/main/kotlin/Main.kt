import kotlin.system.measureTimeMillis

fun main() {

    // Sumar numero por numero en un rango de 1 a n, utilizando
    // un algorimto con complejidad O(n)
    // n = 5 -> 1 +2 +3 +4 + 5= 15

    var n = 5
    println(n * (n + 1) / 2)

}


// O(2^n)
// Exponencial
// El tiempo de ejecucion se duplica con cada
// adicion a la entrada de datos
fun fibonacci(numero: Int): Int {
    return if (numero < 1) {
        numero
    } else {
        // 4 + 3
        // 11
        fibonacci(numero - 1) + fibonacci(numero - 2)
    }
}


// O (n^2)
// El tiempo de ejecucion se va a duplicar proporcionalmente a la entrada de datos.
fun funcionCuadratic() {
    val listaNumeros = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
    listaNumeros.forEach { num1 ->
        listaNumeros.forEach { num2 ->
            println("$num1 y $num2")
        }

    }
}


// Log Linear
// O(n log n)
// Es una combinacion de la lineal y la logaritmica
// cada instancia de n debe ser procesada en un logaritmo
fun LogLinear() {


    val tiempo = measureTimeMillis {
        val numeros = listOf(
            8,
            16,
            24,
            32,
            40,
            48,
            56,
            64,
            72,
            8,
            16,
            24,
            32,
            40,
            48,
            56,
            64,
            72,
            8,
            16,
            24,
            32,
            40,
            48,
            56,
            64,
            72
        )
        var operaciones = 0
        numeros.forEach {
            var numero = it
            while (numero > 1) {
                numero /= 2
                println("Numero vale: $numero")
                operaciones++
            }
        }
        println("Total de operaciones: $operaciones")
    }
    println("Tiempo: $tiempo")
}


// O(log n)
// El tiempo de ejecucion sera directamente proporcional a el
// logaritmo  del tamaño de la entrada de datos.
fun tiempoLogaritmo() {
    var numero = 100
    var operaciones = 0
    while (numero > 1) {
        numero /= 2
        println("Numero es = $numero")
        operaciones++
    }
    println("Num. Operacioens $operaciones")
}

// O (n)
// El tiempo de ejecucion es directamente proporcional
// al tamaño de la entrada de datos
fun tiempoLineal1() {
    val postres = arrayOf("Flan", "Carlota", "Pay", "Brownies")
    val miFavorito = "Pay"
    postres.forEach {
        if (it == miFavorito) {
            println("Encontre tu favorito $it")
        }
    }
}

// O(1)
// El tiempo de ejecución es siempre el mismo
// sin importar el tamaño de la entrada de datos.
fun tiempoConstante() {
    val personajes = arrayOf("Mario", "Luiggi", "Naruto", "Gokun", "Meliodas", "luffy")
    println(personajes[2])
}


// Los terminos menos dominantes se quitan o dejan.
fun ReglaDominante() {
    val numeros = listOf(1, 2, 3, 4, 5)

    val max = numeros.maxOrNull() ?: 0
    println("EL MAXIMO ES: $max")

    numeros.forEach { num1 ->
        numeros.forEach { num2 ->
            println("NUMEROS: $num1 y $num2")
        }
    }
}


// Diferentes entradas de datos, se utilizan diferentes variables
// para representarlos. O(a*b)
fun ReglaProducto() {
    val insectosA = listOf("🐝", "🐛", "🦋", "🐞")
    val insectosB = listOf("🪲", "🪰", "🐞", "🦗")
    var contador = 0
    insectosA.forEach { bichoA ->

        insectosB.forEach { bichoB ->
            if (bichoA == bichoB) {
                println(bichoA)
                contador++
            }
        }

    }

    println("Contador : $contador")
}


// Las constantes se dejan ó quitan.
fun ReglaConstantes() {
    val numeros = listOf(1, 2, 3, 4, 5)
    val min = numeros.minOrNull() ?: 0
    val max = numeros.maxOrNull() ?: 0
    println("$min  y $max")
}

// Diferentes procesos se suman
fun ReglaSuma() {
    val dulces = listOf("🍩", "🍭", "🍫")
    val verduras = listOf("🍅", "🥦", "🥕")
    verduras.forEach { println(it) }
    dulces.forEach { println(it) }
}



