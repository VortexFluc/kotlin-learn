package functional

import java.util.*

fun main() {
    val array = (0..1000).toList();
    val employees = array.map { "Employe №$it" }
    val first30 = employees.take(30)
    val last30 = employees.takeLast(30)
    for (employee in last30) {
        println(employee)
    }

    val array2 = generateSequence(0) {it + 2}
    val evenList = array2.take(10)
}