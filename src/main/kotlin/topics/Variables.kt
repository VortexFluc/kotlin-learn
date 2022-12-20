package topics

fun main() {
    /* Тип переменной указывать необязательно! */
    val test1 = "Hello"

//    test1 = "Goodbye" val - изменить нельзя

    var test2: String = "Hello" // var - изменить можно
    test2 = "Goodbye"


    var test3 = 4
    var test4 = 5

    val test5 = 10

    println("Value of test1 $test1")
    println("Sum is ${2 + 2}")
    println("Sum of test3 and test4 is ${test3 + test4}")
}