package oop.dataclass.equalsAndHashcode

class Address (val city: String, val street: String, val houseNum: Int) {

    fun copy(city: String = this.city, street: String = this.street, houseNum: Int = this.houseNum): Address {
        return Address(city, street, houseNum)
    }

    operator fun component1() = city
    operator fun component2() = street
    operator fun component3() = houseNum

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Address

        if (city != other.city) return false
        if (street != other.street) return false
        if (houseNum != other.houseNum) return false

        return true
    }

    override fun hashCode(): Int {
        var result = city.hashCode()
        result = 31 * result + street.hashCode()
        result = 31 * result + houseNum
        return result
    }

}

fun main() {
    val address1 = Address("Moscow", "Zelenaya", 12)
    val address2 = address1.copy()

    println(address1)
    println(address2)

    println(address1.hashCode())
    println(address2.hashCode())

    println(address1 == address2)

    val (city, street, houseNum) = address1
}