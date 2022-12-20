package topics

fun main() {
    var a: String = "Hello"

    a.length // Можно использовать не боясь NPE


    var b: String? = "Nullable variable"
    b = null

//    b.length   // Нужно использовать safe call!

    // Вернёт длину b, если null, то вернёт null.
    b?.length

    // Elvis оператор - ?:
    // Если в b лежал null, то в l будет -1
    val l = b?.length ?: -1

    // Внесение "неопределённости" в переменную b
    b = if ((0..10).random() > 5) "asdf" else null
    // Оператор !! - выбрасывает NPE, если в переменной null
    val t = b!!.length

}