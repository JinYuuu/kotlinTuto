package demo

import java.util.*

fun loopTest(){
    for(x in 1..10){
        println("Loop : $x")
    }

    val rand = Random()
    //range from 1 to 50
    val magicNum = rand.nextInt(50) + 1

    var guess = 0

    while(magicNum != guess){
        println("guess : $guess")
        guess += 1
    }

    println("Magic Number was $guess")

    for(x in 1..20){
        if (x % 2 == 0){
            continue
        }
        println("Odd : $x")

        if (x == 15) break
    }

    var arr3: Array<Int> = arrayOf(3,6,9)

    for(i in arr3.indices){
        println("Mult 3 : ${arr3[i]}")
    }

    for((index, value) in arr3.withIndex()){
        println("Index : $index Value : $value")
    }
}