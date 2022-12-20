package topics

fun season() {
    val nameOfMonth = "December"
    val season: String = when(nameOfMonth) {

        "December", "January", "February" -> {
            "Winter"
        }

        "March", "April", "May" -> {
            "Spring"
        }

        "June", "July", "August" -> {
            "Summer"
        }

        "September", "November", "October" -> {
            "Autumn"
        }

        else -> {
            "Unknown"
        }
    }

    println(season)
}

fun main() {
    val waterTemperature = -273
    val condition: String = when {
        waterTemperature in 0..100 ->"Liquid"
        waterTemperature < 0 ->"Solid"
        else -> "Gas"
    }
    println(condition)
}