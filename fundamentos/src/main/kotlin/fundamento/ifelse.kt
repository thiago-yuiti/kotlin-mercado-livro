package fundamento

fun main() {
    println(parOuImpar(2))
    println(parOuImpar(3))
}

fun parOuImpar(numero: Int): String {
    return if(numero % 2 == 0 ) {
        "par"
    } else {
       "impar"
    }
}

fun resultadoDaNota(nota: Int) {
    if(nota>=6) {
        println("Passou")
    } else if (nota >= 4) {
        println("recuperaçao")
    } else {
        println("Reprovou")
    }
}