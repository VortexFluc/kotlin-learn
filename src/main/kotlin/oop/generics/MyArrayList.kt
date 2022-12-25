package oop.generics

class MyArrayList<T>(private val initialCapacity: Int = 10): MyList<T> {
    var array = arrayOfNulls<Any>(initialCapacity)
    var size = 0
    var capacity = initialCapacity

    companion object {
        fun <E> myListOf(vararg elements: E): MyArrayList<E> {
            val list = MyArrayList<E>()
            for (element in elements) {
                list.add(element)
            }
            return list
        }
    }

    override fun get(index: Int): T {
        if (size < index) {
            throw IndexOutOfBoundsException("")
        }

        array[index]?.let {
            return it as T
        }

        throw IndexOutOfBoundsException("")
    }

    override fun add(string: T) {
        if (size >= capacity) {
            capacity *= 2
            array = array.copyOf(capacity)
        }
        array[size++] = string
    }

    override fun remove(element: T) {
        for ((index, el) in array.withIndex()) {
            if (el == element) {
                var i = index
                while (i < size) {
                    array[i] = array[i+1]
                    i++
                }
                array[size--] = null
            }
        }
    }

    override fun removeAt(index: Int) {
        if (index > size) throw IndexOutOfBoundsException("")

        var i = index
        while (i < size) {
            array[i] = array[i+1]
            i++
        }
        array[size--] = null
    }

    override fun size(): Int = size

}