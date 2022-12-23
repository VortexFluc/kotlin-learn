package oop.inheritance

class Dog(weight: Float): Animal("Jack", weight, "House") {
    override fun eat() {
        println("Eating a bone")
    }
}