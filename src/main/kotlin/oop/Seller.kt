package oop

class Seller(name: String, age: Int): Worker(name, age), Cleaner {
    override fun work() {
        println("Selling items...")
    }

    override fun clean() {
        println("Seller is cleaning...")
    }
}