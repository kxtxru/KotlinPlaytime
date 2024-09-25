package com.example.ud1_kotlin_aguilaralvaro

fun main() {
println("Como dijo un genio: ")
    var listilla:List<String> = listOf<String>("Porque", "luna", "meme", "cucu", "sonrei", "papa", "como", "pintura", "Itadori")

    var listaFiltrada = listilla.filter{
        it.contains("o", true)
    }
    println("$listaFiltrada bestialmente")
}