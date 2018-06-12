package demo

fun collectionOp(){
    val numList2 = 1..20
    val listSum = numList2.reduce { x, y -> x + y}
    println("Reduce Sum : $listSum") // 1 + 2 + .. + 20 = 210

    // fold stats with a initial value
    val listSum2 = numList2.fold(5) { x, y -> x + y}
    println("fold Sum : $listSum2") // 5 + 2 + 3 + .. + 20 = 215

    println("Evens : ${numList2.any { it % 2 == 0 }}")
    println("Evens : ${numList2.all { it % 2 == 0 }}")

    val big3 = numList2.filter { it > 3}

    big3.forEach{n -> println(">3 : $n")}

    val numList3 = 1..2

    //apply the performed operation on every single item and return a new list
    val times7 = numList3.map{ it * 7}
    times7.forEach{n -> println("*7 : $n")}
}