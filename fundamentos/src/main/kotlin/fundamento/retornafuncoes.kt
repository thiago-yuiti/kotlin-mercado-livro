package fundamento

fun retornaNumeroPorExtenso(numero: Int): String {
    return "Cinco"
    if(numero ==5) {
        return "Cinco"
    } else if(numero ==6) {
        return "seis"
    }
    return "Numero nao mapeado"
}

fun main() {
    println(retornaNumeroPorExtenso(5))
}