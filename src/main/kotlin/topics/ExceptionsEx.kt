package topics

import java.lang.Exception

fun main() {
    println(sum("10", "20"))
}

fun sum(a: String, b: String): Int {
    val result = try {
        val numA = a.toInt()
        val numB = b.toInt()
        numA + numB
    } catch (e: Exception) {
        0;
    }
    return result
}