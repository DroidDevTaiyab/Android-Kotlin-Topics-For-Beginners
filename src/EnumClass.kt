/**
 * Created by Techpass Master on 8-April-21.
 * Website - https://techpassmaster.com/
 * Email id - hello@techpassmaster.com
 */


//  enum classes allow only single type of all constant
// 	We can't change state of the value and we can restrict value in enum class
// 	assign set of value , not assign random value
// 	like Gender(male,female and other) these are set of value of Gender
// 	like days (Sun to Set) assign only set of value not make sense to assign any other value
// 	means>= You can choose one of these sets of values


fun main() {

    val days=Days.SUNDAY

    println(days)
    println(days.number)
    days.printdaywithformated()

//     print all value in the sets with for loop
    for(i in Days.values())
    {
        println(i)
    }

}
// enum with constructor and also we can define enum class without constructor
enum class Days( var number: Int){

    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(7);

// we can also define method
    fun printdaywithformated(){

        println("hello $this")
    }

}
