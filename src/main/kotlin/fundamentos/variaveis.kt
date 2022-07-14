package fundamentos

fun main() {
    //Mutavel
    var nome = "Hugo"
    //Imutavel
    val nomeVal = "Hugo"

    nome = "Vini"

    val teste: String
    teste = "Teste"
}

class variaveis {
    lateinit var teste: String

    fun iniciarVariaveis() {
        teste = "Teste"
    }
}