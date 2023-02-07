package fundamento

fun main() {
    print1a10()
    whileMenorque10()
}

fun whileMenorque10() {
    var x = 0
    while(x <= 10) {
        println(x)
        x++
    }
}

fun doWhileMenorQue10() {
    var x = 0
    do {
        println(x)
        x++
    } while(x<10)
}

fun print1a10() {
    for (numero in 1 .. 10) {
        println(numero)
    }
}

fun printa10a1() {
    for(numero in 10 downTo 1) {
        println(numero)
    }
}

fun printPar1a10() {
    for (numero in 2.. 10 step 2) {
        println(numero)
    }
}

fun printRange(inicio:Int,fim:Int) {
    for (numero in inicio .. fim) {
        println(numero)
    }
}

