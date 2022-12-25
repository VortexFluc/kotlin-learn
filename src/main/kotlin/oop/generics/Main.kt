package oop.generics

fun main() {
    val myList: MyList<Int> = MyArrayList()
    myList.add(123);
    myList.add(321);
    myList.add(123123);
    myList.add(321321);
    myList.add(456);

    for (i in 0 until myList.size()) {
        println(myList.get(i))
    }

    println("--------------------------------------------------")

    myList.remove(456)

    for (i in 0 until myList.size()) {
        println(myList.get(i))
    }

    println("--------------------------------------------------")
    myList.removeAt(0)

    for (i in 0 until myList.size()) {
        println(myList.get(i))
    }
    println("--------------------------------------------------")
    println(myList.size())

}