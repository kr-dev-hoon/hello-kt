fun max(a: Int, b: Int): Int {
    return if(a > b) a else b
}

fun max2(a: Int, b: Int) = if(a > b) a else b

fun main(args: Array<String>) {
    val persons = listOf(Person("영희"), Person("철수"))
    println("Hello World!")
    val rectangle : Rectangle = Rectangle(10, 10);
    println(rectangle.isSquare)
}
