package demo

fun higerOrderFunctionsTest(){
    //higher order functions

    val numList = 1..20

    val evenList = numList.filter{it % 2 == 0}
    evenList.forEach {n -> println(n)}

    val mult3 = makeMathFunc(3)
    println("5 * 3 = ${mult3(5)}")

    val multiply2 = {num1: Int -> num1 + 2}

    val numList2 = arrayOf(1,2,3,4,5)

    mathOnList(numList2, multiply2)
}


// a function that generates functions
//                              function(int) : int
fun makeMathFunc(num1: Int) : (Int) -> Int = {num2 -> num1 * num2}

//an array, a function to use on the list
fun mathOnList(numList: Array<Int>, myFunc: (num: Int) -> Int){
    for(num in numList){
        println("MathOnList ${myFunc(num)}")
    }
}