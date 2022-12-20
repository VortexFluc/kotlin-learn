package topics

fun mainTest() {
    val a = 50
    if (a < 40) {
        println("Less than 40")
    } else if (a < 60) {
        println("Less than 60")
    } else {
        println("Greater than equals 60")
    }
}

fun main() {
    var count = 600
    val food = if (count > 500) {
        count -= 500
        "Pizza"
    } else if (count > 300) {
        count -= 300
        "Shwarma"
    } else {
        "Noodles"
    }

    println("You can have a $food")
}