package demo

fun Test(){
    //variables
    val name = "Derek" //immuable variable

    var myAge = 42 // muable variable

    var bigInt: Int = Int.MAX_VALUE
    var smallInt: Int = Int.MIN_VALUE

    println("Biggest Int : " + bigInt)
    println("Smallest Int : $smallInt")

    var bigLong: Long = Long.MAX_VALUE
    var smallLong: Long = Long.MIN_VALUE

    println("Biggest Long : " + bigLong)
    println("Smallest Long : " + smallLong)

    var bigFloat: Float = Float.MAX_VALUE
    var smallFloat: Float = Float.MIN_VALUE

    println("Biggest Float : " + bigFloat)
    println("Small Float : " + smallFloat)

    var dblNum1: Double = 1.11111111111111
    var dblNum2: Double = 1.11111111111111

    println("Sum : " + (dblNum1 + dblNum2))

    // if (true is Boolean)
    var letterGrade: Char = 'A'
    println("A is a Char : ${letterGrade is Char}")

    //cast
    println("3.14 to Int : " + (3.14.toInt()))
    println("A to Int : " + ('A'.toInt()))
    println("65 to Char : " + 65.toChar())

}