package topics

fun sort(array: MutableList<Int>) {
    for (i in 0 until array.size) {
        for (j in array.size - 1  downTo i + 1) {
            var tmp = 0
            if (array[j] < array[j-1]) {
                tmp = array[j-1]
                array[j-1] = array[j]
                array[j] = tmp
            }
        }
    }
}

fun sort(array: Array<Int>) {
    sort(array.toMutableList())
}

fun sort(vararg array: Int) {
    sort(array.toMutableList())
}

fun main() {
    val array = mutableListOf(5,2,6,1,43,6,67,324,52,23,-1)
    val result = sort(array)
    println(array)
}