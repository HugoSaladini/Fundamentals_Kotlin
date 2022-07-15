package fundamentos

fun main() {
    doWhileMenorQue10()
}

fun whileMenor10() {
    var x = 0
    while (x <10) {
        println(x)
        x++
    }
}

fun doWhileMenorQue10() {
    var x = 0
    do {
        println(x)
        x++
    } while (x < 10)
}

fun print1a10() {
    for (num in 1 .. 10) {
        println(num)
    }
}

fun printa10a1() {
    for (num in 10 downTo 1) {
        println(num)
    }
}

fun printaPar () {
    for (num in 2 .. 10 step 2) {
        println(num)
    }
}

fun printaRange(x: Int, y:Int) {
    for (num in x .. y ) {
        println(num)
    }
}