package com.example.ud1_kotlin_aguilaralvaro

fun main() {
    val weekDays = arrayOf("Lun", "Mar", "Mie", "Jue", "Vie", "Sab", "Dom")
    println(weekDays.size)

    for(pos in weekDays.indices){
        print("$pos:")
        println(weekDays[pos])
    }
println()
    for((pos, value) in weekDays.withIndex()){
        println("$pos:$value")
    }

    println()
    for(day in weekDays) print("$day, ")
}