package oop

class Sportsman {
    fun callWaterboy(waterboy: Waterboy) {
        waterboy.getWater()
    }

    inline fun callWaterboy(bringWater: () -> Unit) {
        bringWater()
    }
}

fun main() {
    val sportsman = Sportsman()
    sportsman.callWaterboy(object : Waterboy {
        override fun getWater() {
            println("Water is supplied")
        }
    })

    sportsman.callWaterboy { println("Using inline function to call waterboy!") }
}