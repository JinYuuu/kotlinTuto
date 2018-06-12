package demo

fun test(){
    // create an object
    val bowser = Animal("Bowser", 20.0, 13.5)
    bowser.getInfo()

    val spot = Dog("Spot", 20.0, 14.5, "Paul Smith")
    spot.getInfo()

    val tweety = Bird("Tweety", true)

    tweety.fly(10.0)
}


open class Animal(val name: String,
                  var height: Double,
                  var weight: Double){
    init{
        // check if there is a desemo value inside of a string
        val regex = Regex(".*\\d+.*")

        //if these requirements are going to be met, an illegal exception is going to be sent
        require(!name.matches(regex)){"Animal name can't contain numbers"}
        require(height > 0){"Height must be Greater then 0"}
        require(weight > 0){"Weight must be Greater then 0"}

    }

    // if you want your message to be provide to the option and your messages could be overwritten
    open fun getInfo(): Unit{
        println("$name id $height tall and weight $weight")
    }
}
//inherience
class Dog(name: String,
          height: Double,
          weight: Double,
          var owner: String) : Animal(name, height, weight){
    override fun getInfo(): Unit{
        println("$name id $height tall and weight $weight and is owned by $owner")
    }
}

interface Flyable{
    var flies: Boolean
    fun fly(disMiles: Double): Unit
}

class Bird constructor(val name: String,
                       override var flies: Boolean = true): Flyable{
    override fun fly(distMiles: Double): Unit{
        if(flies){
            println("$name flies $distMiles miles")
        }
    }
}
