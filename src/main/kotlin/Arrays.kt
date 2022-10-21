fun main() {

}

fun funcionesConArrays() {
    val a1: IntArray = intArrayOf(10, 20, 30, 40, 50)
    val a2: Array<Int> = arrayOf(1, 2, 3, 4)
    val l1: List<Int> = listOf(1, 2, 3, 4, 5)
    val l2: MutableList<Int> = mutableListOf(1, 2, 3, 4)

    // Obtener tamaño del array
    a1.size

    // Obtener los indices o llaves
    a1.indices

    // Obtener algun dato por index
    a1.get(3)
    a1[3]

    // Actualizar un dato
    a1.set(0, 8)
    a1[0] = 8

    // Obtiene el ultimo indice o llave
    a1.lastIndex

    // Obtiene el primer valor
    a1.first()
    a1.firstOrNull()

    // Obtiene el ultimo valor
    a1.last()
    a1.lastOrNull()

    // Obtener el minimo y el maximo
    a1.minOrNull()
    a1.maxOrNull()

    // Imprimir un array
    a1.forEach {
        //println(it)
    }

    // Imprimir un array ordenado
    a1.sortedArray().forEach {
        //println(it)
    }

    // Obtener valor random
    a1.random()

    // Esta vacia la lista?
    a1.isEmpty()

    // No esta vacia la lista?
    a1.isNotEmpty()

    //Obtener promedio
    a1.average()

    a1.reversedArray().forEach {
        //  println(it)
    }


    // Revolver un array
    a1.shuffle()


    // COMO IMPRIMIR UN ARRAY
    for (i in 0 until a1.size) {
        // println(a1[i])
    }

    for (i in a1.indices) {
        // println(a1[i])
    }

    a1.find {
        it == 1
    }
    a1.filter {
        it == 10
    }
}