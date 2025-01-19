fun main() {
    val list = mutableListOf<Int>(1, 2, 3, 4, 5)
    list.removeIf { it > 2 }
    println(list) // Output: [1, 2]

    val set = mutableSetOf<Int>(1, 2, 3, 4, 5)
    set.removeIf { it > 2 }
    println(set) // Output: [1, 2]

    val map = mutableMapOf<Int, String>(1 to "One", 2 to "Two", 3 to "Three", 4 to "Four", 5 to "Five")
    map.removeIf { it.key > 2 }
    println(map) //Output: {1=One, 2=Two}
}