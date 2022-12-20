package functional

fun main() {
    val listOfNumbers = mutableListOf<Int>()
    for (i in 0..99) {
        listOfNumbers.add(i)
    }

    val listOfEvenNumbers = listOfNumbers.filter { it%2 == 0 }
    println(listOfEvenNumbers)

    val names = listOf("Andrey", "Ivan", "Alexey", "Dima")
    val namesStartsWithA = names.filter { it.startsWith("A") }
    println(namesStartsWithA)

    val numbers = (0..100).toList()
    val squaredNums = numbers.map { it * it }
    println(squaredNums)

    val randomNumbers = mutableListOf<Int>()
    for (i in 0 .. 1000) {
        randomNumbers.add((Math.random()*100).toInt())
    }
    println(randomNumbers)

    val dividedBy5or3 = randomNumbers.filter { it%5 == 0 || it%3 == 0}
    println(dividedBy5or3)

    val sqaredList = dividedBy5or3.map { it * it }
    println(sqaredList)

    val sortedByDesc = sqaredList.sortedDescending()
    println(sortedByDesc)

    val stringifyList = sortedByDesc.map { it.toString() }
    println(stringifyList)
}