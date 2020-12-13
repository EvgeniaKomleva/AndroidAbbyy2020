package main

class TestingClass {
    var id: Int by StorageDelegate("id", 20)
}

fun main(args: Array<String>) {
    val testing = TestingClass()

    println(testing.id)

    testing.id = 10

    println(testing.id)
}
