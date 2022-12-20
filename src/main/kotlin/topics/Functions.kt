package topics

import java.util.*

fun main() {
    println(testSimple())
    println(testSimple(3, 10))
    println(testString(10))

    // Передаются по сигнатуре, т.е. по порядку их следования в объявлении функции
    testNamedArguments(4, 2, 5)

    // Можно явно указать привязку к параметрам функции
    testNamedArguments(y = 4, z = 2, x = 5)

    // Если не хватает аргументов - беруться дефолтные
    testDefaultArguments()
    testDefaultArguments(y = 1)
    testDefaultArguments(x = 100, y = 200)

    printEven(1, 2, 3, 4, 5, 6, 7, 8, 9)

    // !!!! * - распаковщик массивов
    printEven(*intArrayOf(1, 2, 3, 4, 5, 6, 7))
}

/*
* См. ниже сокращённый вид функции
* */

//fun testSimple(): Int {
//    return 5 + 5
//}



fun testSimple(): Int = 5 + 5

fun testSimple(x: Int, y: Int): Int = x + y // Можно не указывать тип возвращаемого значения

fun testString(x: Int): String {
    return "String is $x + ${x + 5}"
}

fun testNamedArguments(x: Int, y: Int, z: Int): List<Int> {
    return listOf(x, y, z)
}

/* Можно указать дефолтные значения у аргументов функции */
fun testDefaultArguments(x: Int = 1, y: Int = 2) {
    println(x + y)
}

fun foo(name: String, number: Int = 42, toUpperCase: Boolean = false) {
    (if (toUpperCase) name.uppercase(Locale.getDefault()) else name ) + number
}

/* VARARGS */

fun printEven(vararg numbers: Int) {
    numbers.forEach { e -> if (e % 2 == 0) println(e) }
}