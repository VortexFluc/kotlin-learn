package oop

import java.time.DayOfWeek
import java.util.*
import kotlin.random.Random

class MyRandom {
    companion object {
        fun getRandomInt(begin: Int, end: Int): Int {
            return Random.nextInt(begin, end)
        }

        fun getRandomBool(): Boolean {
            return Random.nextBoolean()
        }

        fun getRandomWeekday(): DayOfWeek {
            return DayOfWeek.of(Random.nextInt(1, 8))
        }
    }
}

fun main() {
    println(MyRandom.getRandomBool())
    println(MyRandom.getRandomInt(0, 1000000))
    println(MyRandom.getRandomWeekday())
}