/**
 * Created by Techpass Master on 8-April-21.
 * Website - https://techpassmaster.com/
 * Email id - hello@techpassmaster.com
 */


//  Class and its single object is created at once
//  No constructors are allowed (init block is allowed)
//  Singleton pattern
//  You can inherit class/ interface
// USE case - If u want to use multiple object then use class and if u want to use single object then use obj without class

fun main() {

    val number = A.number
    println("This is object $number")
    B.add()

    MyClass.h()             //  companion object call without Object name, it can call by the  class name
    MyClass.world.w()
}


object A {                  //    Normal object

    val number: Int = 20
}

object B                    //    object with fun
{
    fun add() {
        val n1 = 10
        val n2 = 20
        val add = n1 + n2
        println("This is the Object B $add")
    }

}

class MyClass {                     //  object and companion object with class

    companion object {             //  companion object call without object name

        @JvmStatic                  // Use @JvmStatic, when you want ot call this fun in the java class
        fun h() {                   // Behave like a STATIC method
            println("Hello")
        }
    }

    object world {
        fun w() {
            println("World")
        }
    }


}


