package fundamentos

fun retornaNumeroPorEstenso(num: Int): String {
    if(num == 5) {
        return "Cinco"
    } else {
        return "Número não é 5"
    }
}

fun main() {
    println(retornaNumeroPorEstenso(55))
}
