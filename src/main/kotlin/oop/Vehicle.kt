package oop

abstract class Vehicle(open val name: String) {
    abstract fun drive();
}

fun main() {
    val car: Vehicle = Car("BMW")
    val bicycle: Vehicle = Bicycle("ATOM")

    if (car is Car) {
        car.name = "Audi"
    }

    if (car !is Car) return

    println(car.name)

    travel(object : Vehicle("Bus") {
        override fun drive() {
            println("Driving a bus")
        }
    })
}

fun travel(vehicle: Vehicle) {
    vehicle.drive()
}