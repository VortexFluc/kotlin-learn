package oop.dataclass

class Student(val name: String, val lastName: String, val id: Int) {
    fun copy(name: String = this.name, lastName: String = this.lastName, id: Int = this.id): Student {
        return Student(name, lastName, id)
    }

    operator fun component1() = name
    operator fun component2() = lastName
    operator fun component3() = id
}

fun main() {
    val student1 = Student("Ivan", "Ivanov", 32154)
    val student2 = student1.copy(id = 654321)
    val (name, lastName, id) = student1

    println(name)
    println(lastName)
    println(id)

    println(student1)
    println(student2)

    println(student1.hashCode())
    println(student2.hashCode())

    println(student1 == student2)
    println(student1 === student2)

}