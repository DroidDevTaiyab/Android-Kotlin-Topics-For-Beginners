
/**
 * Created by Techpass Master on 8-April-21.
 * Website - https://techpassmaster.com/
 * Email id - hello@techpassmaster.com
 */
//  Add new function to the class without declaring it.
//  They can become part of you own class ex Student,User, Teacher ect.
//  They can also become part of predefined class ex String, Int, Float, Char etc.

fun main() {

//EXAMPLE 1

//    val st1= StudentAli()
//    println(st1.hasPassed(25))
//    println(st1.isScholar(98))


//EXAMPLE 2 (REAL USE)

    val str1:String="Hey "
    val str2:String="Taiyab "
    val str3:String="How are you?"

//    Here i want to append all string together
    println(str1.addString(str2,str3))

//    next exm

    var x: Int  =5
    var y :Int  =6

    println("Grater value is ${x.graterValue(y)}")

}
//EXAMPLE 2 (REAL USE)
fun String.addString(s1:String,s2:String): String {         // This is predefined class extension function

    return this +s1 +s2
}

//    next exm
fun Int.graterValue(other: Int):Int{                        // This is predefined class extension function

    if (this>other)
    {
        println("X is grater than Y")

        return this

    }
    else {
        println("X is not grater than Y")
        return other
    }
}

//EXAMPLE 1

//fun StudentAli.isScholar(marks :Int):Boolean            // THIS IS OUR OWN CLASS EXTENSION. FUNCTION
//{
//    if (marks>82)
//        println("Selected for Scholar")
//    else
//        println("Not Selected for Scholar")
//
//    return marks>95
//}

//class StudentAli {                  // THIS IS OUR OWN CLASS
//
//    fun hasPassed(marks :Int) :Boolean{
//        if (marks>33)
//            println("You passed")
//        else
//            println("You failed")
//
//        return marks>33
//    }




