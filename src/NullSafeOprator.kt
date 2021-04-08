/**
 * Created by Techpass Master on 8-April-21.
 * Website - https://techpassmaster.com/
 * Email id - hello@techpassmaster.com
 */


//  Null Safety

//  There are 4 type of null safety
//  1. Safe Call Operator               ?.
//  2. Safe call with let               ?.let {..}
//  3.  Elvis Operator                  ?:
//  4. Not-null Assertion               !!


fun main() {

//    WAP to find out length of name.

    var name : String?   =   ""

//  1. Safe Call Operator       ?.
    //  Return the length if 'name' is not null else return null
    // Use it if don't mind getting null value

    println("Name is ${name?.length}")


//  2. Safe call with let       ?.let {..}
    //    It executes the block ONLY if name is NOT NULL

    name?.let {
        println("Name is ${name?.length}")

    }


//  3.  Elvis Operator                  ?:
    // when we have nullable reference 'name' we can say "is name is not null", use it,
    // otherwise use some nullable value"

    val len = if (name!=null)
    {
        name.length
    }
    else
    {
        -1
    }
    println("Name is $len")


    val lenght=name?.length ?: -1
    println("Name is ${lenght}")


//  4. Not-null Assertion               !!
    // Use it when you are sure the valu is NOT NULL
    // Throws NullPointerException if the value is found to be null

    println("Name is ${name!!.length}")

}