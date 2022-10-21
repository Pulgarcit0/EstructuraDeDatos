fun main() {

}

fun funcionesConHashSet(){
    val letras = charArrayOf('A', 'N', 'A', 'S', 'T', 'A', 'C', 'I', 'A')
    val letrasHashSet = HashSet<Char>()
    letrasHashSet.add('A')
    letrasHashSet.add('B')
    letrasHashSet.clear()
    letrasHashSet.addAll(letras.toHashSet());
    letrasHashSet.size
    letrasHashSet.isEmpty()
    letrasHashSet.remove('A')
    val letrasParaBorrar = charArrayOf('S', 'N')
    letrasHashSet.removeAll(letrasParaBorrar.toHashSet())
    letrasHashSet.indices
    letrasHashSet.count()
    letrasHashSet.toArray()
    letrasHashSet.toSortedSet()
    letrasHashSet.firstOrNull()
    letrasHashSet.lastOrNull()
    letrasHashSet.minOrNull()
    letrasHashSet.maxOrNull()
    letrasHashSet.contains('A')
    letrasHashSet.containsAll(letrasParaBorrar.toHashSet())

}