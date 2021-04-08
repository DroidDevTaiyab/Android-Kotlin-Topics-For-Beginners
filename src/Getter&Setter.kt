/**
 * Created by Techpass Master on 8-April-21.
 * Website - https://techpassmaster.com/
 * Email id - hello@techpassmaster.com
 */

fun main() {

    var t1=Teacher("taiyab",11)

    println(t1.tName)
    println(t1.tAge)

    t1.tAge=-11
}


class Teacher(var name:String, var age: Int)
{

    var tName:String=name
        get() {
            return field.toUpperCase()
        }
    var tAge:Int=age
        set(value) {

            if (value>0)
            {
                field=value
            }
            else
            {
                println("Age can't be negative")
            }
        }


}