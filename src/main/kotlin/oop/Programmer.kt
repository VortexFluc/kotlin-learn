package oop

class Programmer(name: String, age: Int, var language: String): Worker(name, age), Cleaner {
    override fun work() {
        println("Write code on $language")
    }

    override fun clean() {
        println("Programmer is cleaning...")
    }
}