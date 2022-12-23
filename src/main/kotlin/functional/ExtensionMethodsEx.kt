package functional

fun main() {
    val age = 15
    if (age.isAgeValid()) {
        println("Valid")
    }

    if(age.isPositive()) {
        println("Positive")
    }

    val str = ""
    if (str.isNotEmpty()) {
        println("Is not empty")
    }

    if (29.isPrime()) {
        println("Prime!")
    }

    val list = listOf<Int>()
    myWith(list) {
        sum()
    }

    val str2 = "lkaslkdf"
    myWith(str) {
        length
    }
}

//fun isAgeValid(age: Int) = age in 12..100

fun Int.isAgeValid() = this in 12..100

fun Int.isPositive() = this >= 0

fun Int.isPrime(): Boolean {
    if (this <= 3) return true
    for (i in 2 until this) {
        if (this%i == 0) return false
    }
    return true
}

inline fun <T> myWith(list: T, operation: T.() -> Unit) {
    list.operation();
}