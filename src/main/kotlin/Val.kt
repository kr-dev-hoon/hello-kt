fun val_var() {

    val name1 = "string";
    val name2: String = "string";
    var name3 = "string";
//        name1 = "impossible";
    name3 = "possible";
}

fun string(strArray: Array<String>) {
    val str = strArray[0]
    println("string is $str")
    println("string is {$strArray[0]}")
}