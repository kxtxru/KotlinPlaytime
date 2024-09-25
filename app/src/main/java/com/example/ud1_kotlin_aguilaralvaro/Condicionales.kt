package com.example.ud1_kotlin_aguilaralvaro

fun main(){

getMonth(2)
getTrim(month = 2)
getSem(month = 4)


    println(result2(23))
    println(result2("ggss"))


}

fun getSem(month: Int) {
    when(month) {
    in 1 .. 6 -> println("1ª Semestre")
        in 7 .. 12 -> println("2ª Semestre")
        !in 1 .. 12 -> println("No es un mes valido loquete")

    }
}


fun getMonth(month:Int){
    when(month) {
        1 -> println("Ene")
        2 -> println("Feb")
        3 -> println("Mar")
        4 -> println("Abr")
        5 -> println("May")
        6 -> println("Jun")
        7 -> println("Jul")
        8 -> println("Ago")
        9 -> println("Sep")
        10 -> println("Oct")
        11 -> println("Nov")
        12 -> println("Dic")
        else -> {
            println("hay")
        }
    }
}

fun getTrim(month:Int){
    when(month) {
        1, 2, 3 -> println("1 Trimestre")
        4, 5, 6 -> println("2 Trimestre")
        7, 8, 9 -> println("3 Trimestre")
        10, 11, 12 -> println("4 Trimestre")
        else -> {
            println("ff bro")
        }
    }
}

fun result(value: Any){
    when(value) {
        is Int -> println(value+10)
        is String -> println(value)
        is Boolean -> if(value) println("Yes")
        else -> println("Try again")
    }
}

fun result2(value: Any) = when(value) {
        is Int -> (value+10)
        is String -> (value + " 2.0")
        is Boolean -> !(value)
        else -> "ff bro"
    }

