package demo


fun main(args : Array<String>) {
    //null safty is built directly in kotlin
    // you cannot assign a null
    // you can allow a null value to be assigned
    var nullVal: String? = null

    //a function may return null
    fun returnNull(): String?{
        return null
    }

    var nullVal2 = returnNull()

    if(nullVal2 != null){
        println("nullVal2.length")
    }

    var nullVal3 = nullVal2!!.length

    var nullVal4: String = returnNull() ?: "No Name"
}


