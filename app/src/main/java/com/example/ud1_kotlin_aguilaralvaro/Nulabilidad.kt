package com.example.ud1_kotlin_aguilaralvaro

fun main(){
    var name = "Alvaro"
    var name2:String? = null

    if(name == "Alvaro"){}
    if(name.substring(2) == "Alvaro"){}

    if(name2 != null) if(name2.substring(2) == "Alvaro"){}
    if(name2!![0] == 'A'){}
    name2!!.substring(1)

    if(name2?.get(0) == 'A'){

    }else println("No me entra >.<")
}

fun showText(text:String?):Int? {
    println(text)
    return if (text?.length ?: 0 > 5) {
        10
    } else return null

}
