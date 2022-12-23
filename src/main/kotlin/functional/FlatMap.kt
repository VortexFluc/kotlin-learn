package functional

fun main1() {
    val revenueByWeek = listOf(
        listOf(6,5,4,5,4,2),
        listOf(7,6,5,4,3,3),
        listOf(8,7,6,3,2,4),
        listOf(9,8,7,2,1,5)
    )

    val average = revenueByWeek.flatten().average()
    println(average)
}

fun main() {
    val data1 = mutableMapOf<String, List<Int>>()

    data1["file1"] = listOf(15, 20, 25, 30, 35)
    data1["file2"] = listOf(15, 20, 25, 30, 35)
    data1["file3"] = listOf(15, 20, 25, 30, 35)

    val data2 = mapOf(
        "file1" to listOf(15, 20, 25, 30, 35)
    )

    val data3 = mapOf(
        Pair("file1", listOf(15, 20, 25, 30, 35))
    )

    val average = data1.flatMap { it.value }.average()
    println(average)
}