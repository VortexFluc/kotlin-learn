package oop.companionobj

class CalculateEx {

    companion object {
        private const val PI = Math.PI
        fun square(num: Int): Int = num * num
        fun lengthOfCicrle(radius: Float) = 2 * PI * radius
    }
}

fun main() {
    println(CalculateEx.square(4))
    println(CalculateEx.lengthOfCicrle(5.32f))
}