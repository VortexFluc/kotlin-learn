package functional

fun main() {
    val sum: (Int, Int) -> Int = {a, b -> a + b}
    println(sum(2, 10))

    val sqr: (Int) -> Int = {it * it}
    println(sqr(10))

    val rectanglePerimeter: (Int, Int) -> Int = {a, b -> (a + b)*2}
    val helloName: (String) -> String = {"Hello, $it"}
    val sortByDesc: (MutableList<Int>) -> MutableList<Int> = {
        it.sortDescending()
        it
    }
    println(rectanglePerimeter(2,5))
    println(helloName("Andrey"))
    println(sortByDesc(mutableListOf(5,1,56,2,6,8,-9,-1,4,6)))
}