package oop

abstract class Worker(val name: String, var age: Int) {
    abstract fun work()
}

fun main() {
    val worker1 = Seller("Andrey", 24)
    val worker2 = Seller("Artem", 25)
    val worker3 = Seller("Dima", 31)
    val worker4 = Programmer("Lesha", 30, "Java")
    val worker5 = Programmer("Vika", 24, "Kotlin")
    val worker6 = Director("Sanya", 40)

    val workerList = mutableListOf(worker1, worker2, worker3, worker4, worker5, worker6)

    for (worker in workerList) {
        worker.work()
        if (worker is Cleaner) {
            worker.clean()
        }
    }
}