package fundamentos

class  Carro(var cor: String, val anoFabricacao:Int, val dono: Dono) {

}

class Dono(var nome: String, var idade: Int) {

}
fun main() {
    var carro = Carro("branco", 2021, Dono("nome", 21))

    println(carro.cor)
    carro.cor = "Preto"
    println(carro.cor)

    println(carro.dono.nome)
    carro.dono.nome = "Daniel"

    println(carro.dono)
}