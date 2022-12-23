package oop.methods

class MethodEx(val name: String, var age: Int, val weight: Float = 0f) {

    val isOld: Boolean
    get() = age >= 12

    fun printInfo() {
        println("Name: $name, Age: $age, Weight: $weight")
    }
}

fun main() {
    val test = MethodEx("Test", 1234, 54f)
    test.printInfo()
    println(test.isOld)

    test.age = 10
    println(test.isOld)
    test.hello()
}

fun MethodEx.hello() {
    println("Hello!")
}
