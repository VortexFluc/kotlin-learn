package functional

fun main() {
    val phoneNumbersGen = generateSequence(89000000000) { it + 1 }
    val phoneNumbers = phoneNumbersGen.take(1000)

    val namesGen = generateSequence(0) { it + 1 }
    val names = namesGen.take(1000).map { "Имя $it" }

    val zippedUsers = names.zip(phoneNumbers)
    for (pair in zippedUsers) {
        println("Имя: ${pair.first} Телефон: ${pair.second}")
    }

    val nameLastName = listOf("Андрей Михайлин", "Артём Некрасов", "Дмитрий Кондратьев", "Алексей Некрасов")
    val pairs = nameLastName.map { Pair(it.substringBefore(" "), it.substringAfter(" ")) }




}