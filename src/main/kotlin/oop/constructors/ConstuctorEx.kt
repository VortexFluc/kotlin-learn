package oop

class ConstuctorEx(var name: String, var population: Long) {
    constructor(): this("", 0) {
    }
}

class ConstructorEx2(val name: String, val population: Long) {

}

fun main() {
    val russia = ConstuctorEx("Russia", 144_000_000)
    println(russia.name)
    russia.population = 145_000_000
    println(russia.population)

    val russiaFinal = ConstructorEx2("Russia", 144_000_000)
//    russiaFinal.name = "Test"

    val empty = ConstuctorEx()
    println("${empty.name} ${empty.population}")


}