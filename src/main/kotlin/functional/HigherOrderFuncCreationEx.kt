package functional

fun main() {
    println(modifyString("Hello") { "$it, World" })
    modifyList(listOf(5,4,3,6,8)) { println(it)}
    modifyList(listOf(5,4,3,6,8)) { println(it.sum())}
    
}

fun modifyString(string: String, modify: (String) -> (String)): String {
    return modify(string);
}

inline fun modifyList(numbers: List<Int>, func: (List<Int>) -> Unit) {
    func(numbers)
}