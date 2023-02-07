package fundamento

fun main() {
    var nome = println(retornaNome())
    println(nome)
    dizOi(retornaNome(), 21)
    dizOi("Thiago")
}

fun retornaNome(): String {
    return "Gustavo"
}

fun dizOi(nome: String, idade: Int = 20) {
   println("oi ${nome}, parabéns pelo seus ${idade} anos")
}