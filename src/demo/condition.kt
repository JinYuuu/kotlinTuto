package demo

fun testCondition(){
    //< > >= <= == !=

    // && || !

    val age = 8 // not change

    if(age < 5){
        println("Go to Preschool")
    } else if(age == 5){
        println("Go to Kindergarten")
    } else if ((age > 5) && (age <= 17)) {
        val grade = age - 5
        println("Go to Grade $grade")
    } else {
        println("Go to Collage")
    }

    // switch
    when(age){
        1,2,3,4 -> println("Go to Preschool")

        5 -> println("Go to Kindergarten")

        in 6..17 -> {
            val grade = age - 5
            println("Go to Grade $grade")
        }

        else -> println("Go to College")
    }

}