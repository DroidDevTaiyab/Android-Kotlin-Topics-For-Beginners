/**
 * Created by Techpass Master on 8-April-21.
 * Website - https://techpassmaster.com/
 * Email id - hello@techpassmaster.com
 */


//Let's see the different between sealed class to enum class

// Sealed class allowed to create instant with different type       (Ex- String,Int, Flot etc)
// unlike enum class which restrict to use same type of constant    (Ex- only one type on constant)


fun main() {

//    Enum Class
    println("_________________________Enum Class________________________________")
    for (i in Days.values()) {
        println(i)
    }

//    Sealed Class
    val sunday: Days2 = Days2.Tuesday(5.5f)
    println("_____________________________Sealed Class___________________________")
    printDays(sunday)


}


enum class Days1(var days: String)        // SINGLE TYPE OF ALL CONSTANT
{
    SUNDAY("HELLO SUNDAY"),
    MONDAY("HELLO MONDAY"),
    TUESDAY("HELLO TUESDAY"),
    WEDNESDAY("HELLO WEDNESDAY"),
    THURSDAY("HELLO THURSDAY"),
    FRIDAY("HELLO FRIDAY"),
    SATURDAY("HELLO SATURDAY");
}

sealed class Days2 {

    class Sunday(val helloSunday: String) : Days2()
    class Monday(helloMondayDays: Int) : Days2()
    class Tuesday(helloTeusdayDays: Float) : Days2()

}

fun printDays(days: Days2) {

    when (days) {
        is Days2.Sunday -> println(" This is class Sunday")
        is Days2.Monday -> println(" This is class Monday")
        is Days2.Tuesday -> println(" This is class Tuesday")
    }
}