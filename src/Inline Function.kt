/**
 * Created by Techpass Master on 8-April-21.
 * Website - https://techpassmaster.com/
 * Email id - hello@techpassmaster.com
 */

fun main() {

//    addTwoNo { }        // behind the seen kotlin create class and instant then execute the function
    addTwoNo {}     // in Inline fun  not create any instant

}


inline fun addTwoNo(function: () -> Unit)
{

    val x = 2
    val y = 2
    println("add two number: ${x + y}")

}