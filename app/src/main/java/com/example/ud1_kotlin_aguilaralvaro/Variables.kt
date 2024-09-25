package com.example.ud1_kotlin_aguilaralvaro

fun main(){
    //println("i was at house eating dorito when phone ring")
    //println("\"Club penguin is kil\"")
    //println("\"no\"")
    numericas()
    alfanum()
    logicas()
    showMyName("durete")
    println("R: ${multiply(3,5)}")
    println("R: ${divide(9, 3)}")

    condicionales()
}

fun condicionales() {
    
}

fun logicas() {
    //boolean
    val tof:Boolean = false
    val truers = false
    println(tof)

    var nueva = !tof
    println(nueva)
    nueva = 10>5
    println(nueva)
}

fun alfanum() {

    //char
    val mychar = 'u'
    //string
    val mystring = "My name is: "
    val name = "daystar"
    println(mystring + name)
    var msg = "My name is: $name"
    println(msg)
    println(name.uppercase())


}

fun numericas() {
    //int
    val age = 77
    val age2 = 44
    var age3 = 21
    //age = 20 No se puede
    println(age)
    println(age2)
    age3 = age + age2
    println(age3 + 10)

    //long
    val superf:Long = 123234345
    val super2 = Int.MAX_VALUE+30

    //float y double
    var volumen = 10.5
    var volumen2 = 10.5f
    println(volumen + age)

}

fun showMyName(name:String){
 println(name)
}

fun multiply(first:Int, second:Int):Int = first * second
fun divide(D:Int, d:Int) = (D/d).toDouble()