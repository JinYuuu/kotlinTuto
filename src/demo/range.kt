package demo

fun testRange(){
    val ontTo10 = 1..10
    val alpha = "A".."Z"
    println("R in Alpha : ${"R" in alpha}")

    val tenTo1 = 10.downTo(1)

    val twoTo20 = 2.rangeTo(20)

    val rng3 = ontTo10.step(3) // step through 3 each time

    for(x in rng3) println("rng3 : $x")

    for(x in tenTo1.reversed()) println("Reverse : $x")

}