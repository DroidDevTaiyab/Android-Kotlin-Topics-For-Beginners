/**
 * Created by Techpass Master on 8-April-21.
 * Website - https://techpassmaster.com/
 * Email id - hello@techpassmaster.com
 */


// Sealed classes is a class with restricts the class hierarchy,
// A class can be declared as sealed class using "sealed keyword before the class name
// It is used of represent restricted class hierarchy.
//  you can't create object of sealed class because it is by default abstract
// constructor is always private
// Mostly sealed classes is used to when statement

fun main() {

//    var father1=Father1()   // Sealed class type not be instantiated

    val c1=Father1.Child1()
    val c2=Father1.Child2()
    val myObj=Father1.HELLO

    family(c1)      // child 1
    family(c2)      // child 2
    family(myObj)   // object

}

sealed class Father1() {

    class Child1:Father1()
    class Child2:Father1()
    object HELLO : Father1()
}

fun family (member:Father1)
{
    when(member)
    {
        is Father1.Child1 -> println("Child 1")
        is Father1.Child2 -> println("Child 2")
        Father1.HELLO-> println("This is OBJ")
        //no need to add else
    }
}
