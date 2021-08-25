import java.util.*

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

fun smartCast(e: Expr): Int {

    if (e is Num) {
        println("num :${e.value}")
        return e.value;
    } else if (e is Sum) {
        println("sum : ${e.left}")
        return smartCast(e.left);
    }
    return 0
}

fun smartCast2(e: Expr): Int =
    when (e) {
        is Num -> {
            println("num :${e.value}")
            e.value
        }
        is Sum -> {
            println("sum : ${e.left}")
            smartCast2(e.left)
        }
        else -> 0
    }


fun getMnemonic(color: Color): String {
    return when (color) {
        Color.RED -> return "Richard"
        Color.BLUE -> return "Battle"
        else -> "d"
    }
}

fun getMnemonic2(color: Color): String {
    return when (color) {
        Color.RED, Color.GREEN -> return "Richard"
        Color.BLUE -> return "Battle"
        else -> "d"
    }
}

fun mix(color: Color, color2: Color) = when (setOf(color, color2)) {
    setOf(Color.RED, Color.GREEN) -> "Richard"
    setOf(Color.BLUE, Color.GREEN) -> "Battle"
    else -> "d"
}

fun mixCondition(color: Color, color2: Color) = when {
    (color == Color.RED && color2 == Color.GREEN) || (color == Color.GREEN && color2 == Color.RED) -> "Richard"
    (color == Color.BLUE && color2 == Color.GREEN) || (color == Color.GREEN && color2 == Color.BLUE) -> "Battle"
    else -> "d"
}

fun numbers(value: Int) = when (value) {
    in 1..100 -> "1~100"
    in 200..201, in 300..301 -> "200~201 or 300~301"
    else -> "not contains"
}

fun iteration() {
    val range: IntRange = 1..10 // 1~10

    for (i in 1..10) {
        println("num : $i")
    }

    for (i in 100 downTo (1) step (2)) {
        println("num : $i")
    }

    val map = TreeMap<Char, String>()

    for (c in 'A'..'F') {
        map[c] = Integer.toBinaryString(c.toInt())
    }

    for ((key, value) in map) {
        println("$key = $value")
    }

    val arrayList = arrayListOf(123, 456, 789)

    for ((idx, value) in arrayList.withIndex()) {
        println("index is $idx, value is $value")
    }

    val isContain = 'A' in 'A'..'F'
    val isNotContain = 'c' in 'A'..'F'

    val isContainNative = 'A' <= 'A' && 'F' >= 'A'
    val isNotContainNative = 'A' <= 'c' && 'F' >= 'c'
}