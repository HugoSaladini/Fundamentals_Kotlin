package fundamentos

fun main() {
    println(parOuImpar(3))
    println(parOuImpar(6))

    resultadoNota(10)
    resultadoNota(6)
    resultadoNota(3)
    resultadoNota(-5)

}

fun parOuImpar(num: Int): String {
    return if(num % 2 == 0) {
        "Par"
    } else {
        "Impar"
    }
}

fun resultadoNota(nota: Int) {
    if(nota > 6) {
        println("Aprovado")
    } else if(nota == 6) {
        println("Recuperação")
    } else if( nota > 0 && nota <= 5){
        println("Reprovado")
    } else {
        println("Nota invalida")
    }
}