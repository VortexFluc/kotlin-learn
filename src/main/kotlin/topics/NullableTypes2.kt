package topics

private var name: String? = null

fun main() {
    val a: String? = null
    val b: String? = "412123"
    val c: String? = ""
    val result = (a?.length ?: 0) + (b?.length ?: 0) + (c?.length ?: 0)
}
