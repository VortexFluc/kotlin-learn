package topics

fun main() {
    val child = Person("Jack", "Riddle", 42)
    val p1 = Person("Tom", "Riddle", 200, child)
    println(p1.age)

    val rectangle1 = Rectangle(5.6, 3.4)
    println("The pereimeter is ${rectangle1.periemeter}")

    val rectangle2 = Rectangle(5.6, 3.4)
    println(rectangle1 == rectangle2)
}
// Класс с первичным конструктором (внутри оператора () )
class Person(val firstName: String,
             val lastName: String,
             var age: Int) {
    var children: MutableList<Person> = mutableListOf()

    // Вызывается после вызова конструктора
    init {
        println("Person is created")
    }

    // Вторичный конструктор
    constructor(firstName: String, lastName: String, age: Int, child: Person):
            this(firstName, lastName, age) {
        children.add(child)
    }

     // Конструктор без аргументов
    constructor(): this("", "", -1)
}

// data - декларация о создании toString, hashCode, getters and setters
data class Rectangle(var height: Double, var length: Double) {
    var periemeter = (height + length) * 2

    var test = 1
        get() = field + 1 // field == this.test
        set(value) {
            if (value < 0) println("Negative value")
            field = value
        }

    fun area() = height * length
}