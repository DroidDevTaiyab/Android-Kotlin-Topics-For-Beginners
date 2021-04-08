/**
 * Created by Techpass Master on 8-April-21.
 * Website - https://techpassmaster.com/
 * Email id - hello@techpassmaster.com
 */

fun main()
{
    val p1=Person("Taiyab",59)

    println("Name is ${p1.name}")
    println("Age is ${p1.age}")
    println("He/She is Senior Citizen ${p1.isSeniorCitizon}")
}

 class Person (var name: String, var age :Int) {

    var isSeniorCitizon:Boolean = false

    init {


        

        if (age>=60) isSeniorCitizon =true else isSeniorCitizon = false
    }

}

//Ex- 2

//fun main() {
//
//    val s1 = Student ("Taoyab", 63)
//
//}
//
//
//class Student(var name:String, var age : Int) {
//
//    init {
//
//        println("Name is $name")
//        println("Age is $age")
//    }
//}