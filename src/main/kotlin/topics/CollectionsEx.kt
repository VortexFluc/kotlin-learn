package topics

import java.util.*
import kotlin.collections.ArrayList

fun main1() {
    val array: Array<Int?> = arrayOf(1, 2, 3, 4, 5)
    val nullableArray = arrayOfNulls<Int?>(10)
    array[1] = null
    println(array.contentToString())
}

fun main(args: Array<String>) {
    val listOfNumbers: MutableList<Int> = mutableListOf()
    listOfNumbers.add(5)
    listOfNumbers.add(123)
    listOfNumbers.add(2345)
    listOfNumbers.add(5534)
    println(listOfNumbers)
}