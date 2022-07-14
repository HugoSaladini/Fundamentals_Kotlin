package fundamentos

class Caror(var cor: String, val anoFabricacao: Int, val dono: Dono) {

}

data class Dono(var nome: String, var idade: Int) {

}

fun main() {
    var carro = Caror("Branco", 2021, Dono("Hugo", 28))

    println(carro.cor)
    carro.cor = "Preto"

    println(carro.cor)

    carro.dono.nome = "Hugo Saladini"

    println(carro.dono)
}