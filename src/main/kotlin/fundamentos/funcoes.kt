package fundamentos

fun main() {
    dizOi("Vini", 25)
    dizOi(idade = 22, nome = "Nathi")
    dizOi(retornaNome())
}

fun retornaNome(): String {
    return "Hugo"
}

fun dizOi(nome: String, idade: Int = 28) {
    println("Oi ${nome}, a sua idade é ${idade}")
}