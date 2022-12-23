package oop

class Car(override var name: String = "Car"): Vehicle(name) {
    override fun drive() {
        println("Driving a car")
    }

    fun startEngine(): Boolean {
        return Math.random() > 0.5
    }
}