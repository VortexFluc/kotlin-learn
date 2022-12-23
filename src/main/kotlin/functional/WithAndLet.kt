package functional

var name: String? = "nullnullnull"

fun mainWithAndLet1() {
    name?.let {
        if (it.length > 5) {
            println("alkdflksamflk")
        }
    }
}

fun mainWithAndLet2() {
    val list = mutableListOf<Int>()
    for (i in 0 until 1000) {
        list.add((Math.random() * 100).toInt())
    }
    println(list.sum())
    println(list.average())
    println(list.minOrNull())
    println(list.maxOrNull())
    println(list.first())
    println(list.last())

    /*Вызов list повторили 8 раз. Можно использовать with -> можно обращаться напрямую*/

    with(list) {
        println(sum())
        println(average())
        println(minOrNull())
        println(maxOrNull())
        println(first())
        println(last())
    }
}

var nullableNums: MutableList<Int>? = mutableListOf()
fun main() {
    nullableNums?.let {
        with(it) {
            for (i in 0 until 1000) {
                add((Math.random() * 100).toInt())
            }

            val result = filter { it % 2 == 0 }.take(30)
            println(result)
        }
    }
}