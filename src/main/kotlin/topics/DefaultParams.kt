package topics

fun main() {
    printInf("Mihaylin", "Andrey", "Dmitrievich")
    printInf(patronymic="Ivanovich")
}

fun printInf(lastName:String = "", name:String = "", patronymic:String = "") {
    if (!lastName.isEmpty()) println("Lastname: $lastName")
    if (!name.isEmpty()) println("Name: $name")
    if (!patronymic.isEmpty()) {
        println("Middle name: $patronymic")
    }
}