/**
 * Created by Techpass Master on 8-April-21.
 * Website - https://techpassmaster.com/
 * Email id - hello@techpassmaster.com
 */

fun main() {

    //    Non-Parameter constructor

//    var f1=Father()
//    println(f1.name)
//    println(f1.age)

//    Parameter constructor
    var autoMobiles = AutoMobiles("Car", 4, 5, "Patrol", true) // its called Primary constructor
    var autoMobiles2 = AutoMobiles("Bus", 10,"Diesel")    // its called secondary constructor
}

// this is primary constructor with parameter
class AutoMobiles(var name: String, var tyres: Int, var maxSeat: Int, var engine: String, isParameter: Boolean) {

    var myParameter = isParameter

    // we can also initializer block with init
    init {
        println("name is ${name}")
    }

    init {
        println("Type is ${tyres}")
    }

    init {
        println("MaxSeat is ${maxSeat}")
    }

    init {
        println("Engine type is ${engine}")
    }

    // this is Secondary constructor with parameter
    constructor(secConstName: String, secConstMaxSeat: Int, secConstEngine: String) :
            this(secConstName, 4, secConstMaxSeat, secConstEngine,true)
}

// this is also primary constructor with Non-parameter
class Father {
    var name: String = "Ali"
    var age: Int = 35

}

