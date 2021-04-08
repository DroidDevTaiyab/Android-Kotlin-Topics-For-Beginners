/**
 * Created by Techpass Master on 8-April-21.
 * Website - https://techpassmaster.com/
 * Email id - hello@techpassmaster.com
 */


// Lazy initialization was designed to prevent unnecessary initialization object
// Variable not be initialization unless use it in the code
// it initialization only once, next time when you use it, you get the value from cache memory
// The variable can be var and val


//val newAge: Int = 25;             // Waste of memory


// Variable not be initialization unless use it in the code
// it initialization only once, next time when you use it, you get the value from cache memory
val newAge: Int by lazy {
    25
}


fun main() {

    val agePush = newAge + 1            // first time value saved in cache memory
    val agePush2 = newAge + 2           // second time value lode from cache memory, it not initialization again


    println(agePush)
    println(agePush2)

    val s1: Student by lazy {
        Student("Taiyab", 63)
    }


    print(s1.name)
}


class Student(var name: String, var age: Int) {

    init {

        println("Name is $name")
        println("Age is $age")
    }
}