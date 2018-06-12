package demo

fun testArray(){
    var myArray = arrayOf(1, 1.23, "Doug")

    println(myArray)

    myArray[1] = 3.14

    println("Array Length : ${myArray.size}")

    println("Doug in Array : ${myArray.contains("Doug")}")

    var partArray = myArray.copyOfRange(0,1)

    println("First : ${myArray.first()}") // first element
    println("Doug Index : ${myArray.indexOf("Doug")}")

    var sqArray = Array(5, { x -> x * x}) //array of index^2
    println(sqArray[2])

    var arr2: Array<Int> = arrayOf(1,2,3)
}