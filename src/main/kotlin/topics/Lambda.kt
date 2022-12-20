package topics

fun main() {
    val a = listOf<Int>(1, 2, 3, 4, 5)



    a.forEach{ e -> println(e) }

    println(a.map{e -> e * 2})

    println(a.filter{ e -> e % 2 == 0 })

    a.reduce{ sum, e -> sum + e }

    a.sortedByDescending { it }

    a.any { it > 10 } // true - если хотя бы один элемент удовлетворяет условию

    a.all { it < 10 } // true - если все элементы удовлетворяют условию
    a.sum()

    val numbers = listOf(1, 2, -3, 2, -59)

    val (positive, negative) = numbers.partition { it > 0 }

    println(positive)
    println(negative)

    // Тип результата - HashMap
    val result = listOf<String>("a", "b", "ba", "ccc", "ad").groupBy { it.length }

    println(result)

}

fun name(x: Int): Int {
    return x + 2
}