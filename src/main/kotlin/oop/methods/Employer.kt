package oop.methods

import java.time.LocalDate

class Employer(val name: String, var position: String, val year: Int) {

    val experience: Int
    get() = LocalDate.now().year - year

    fun work() {
        println("Working...")
    }
}

fun main(args: Array<String>) {
    val employer = Employer("Andrey", "Backend", 2021)
    employer.printInfo()
}

fun Employer.printInfo() {
    println("Name: $name, Position: $position, Year: $year, Experience: $experience")
}