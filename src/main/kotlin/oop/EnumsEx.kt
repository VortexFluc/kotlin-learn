package oop

import oop.Month.*
import oop.Season.*

fun main() {
    val month = SEPTEMBER
    val season = when(month) {
        DECEMBER, JANUARY, FEBURARY -> WINTER
        MARCH, APRIL, MAY -> SPRING
        JUNE, JULY, AUGUST -> SUMMER
        SEPTEMBER, NOVEMBER, OCTOBER -> AUTUMN
    }

    println(season)
    println(month.tempAverage)
}

enum class Month(val tempAverage: Int) {
    JANUARY(-10), FEBURARY(-5), MARCH(5), APRIL(15), MAY(23), JUNE(25), JULY(25), AUGUST(26), SEPTEMBER(10), OCTOBER(5), NOVEMBER(-3), DECEMBER(-10)
}

enum class Season {
    WINTER, SPRING, SUMMER, AUTUMN
}