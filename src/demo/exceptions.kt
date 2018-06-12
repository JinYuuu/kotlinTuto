package demo

fun testExpectiosn(){
    val divisor = 2

    try {
        if (divisor == 0) {
            throw IllegalArgumentException("Can't Divide by Zero")
        } else {
            println("5 / $divisor = ${5 / divisor}")
        }
    }catch(e: IllegalArgumentException){
        println("${e.message}")
    }
}