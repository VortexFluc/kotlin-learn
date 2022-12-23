package oop.anonymousclass

class Bicycle(name: String): Vehicle(name) {
    override fun drive() {
        println("Driving bicycle")
    }
}