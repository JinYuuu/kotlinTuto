package demo

fun testString(){

    //String
    val myName = "Jin"

    val longStr = """This is a
        | long string""""

    var fName: String = "Doug"
    var lName: String = "Smith"

    fName = "Sally"

    var fullName = fName + " " + lName

    println("Name : $fullName")
    println("1 + 2 = ${1 + 2}")  // 1 + 2 = 3
    println("String Length : ${longStr.length}")

    var str1 = "A random string"
    var str2 = "A random string"

    println("Strings Equal : ${str1.equals(str2)}")
    // equals : true/false
    println("String == : ${str1 == str2}" )
    // true if they have the same content

    println("Compare A to B : ${"B".compareTo("A")}")
    // compareTo : egale:0 ;  infériere: -1 ; plus grand :1

    println("2nd Index : ${str1[2]}")
    println("Index 2 - 7 : ${str1.subSequence(2, 8)}")
    println("Contains random : ${str1.contains("random")}")
}