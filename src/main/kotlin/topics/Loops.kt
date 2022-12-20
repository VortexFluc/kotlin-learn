package topics

fun main() {
    val items = listOf("apple", "banana", "orange") // List.of() Java 9

    // mutableListOf<String>("apple", "banana", "orange") - изменяемый список (с возможностью добавления)

    /* FOR EACH LOOP */
    for (item in items) {
        println(item)
    }

    /*WHILE LOOP*/
    var index = 0
    while (index < items.size) {
        println("Item at $index is ${items[index]}")
        index++
    }

    /* Диапазоны (как в Python) */
    for (i in 1..10)
        println(i)

    for(i in 1 until 10) // until - невключительно
        println(i)


    for(i in 10 downTo 1) // downTo - убывающий порядок
        println(i)

    for (i in 0..100 step 10) // step - шаг итерации
        println(i)
}