package oop

open class Animal(val name: String, var weight: Float, val habitat: String) {
    open fun eat() {
        println("Eating a food")
    }

    open fun run() {
        println("Running")
    }
}

fun main() {
    val dog = Dog(3f)
    println(dog.habitat)
}