/**
 * Created by Techpass Master on 8-April-21.
 * Website - https://techpassmaster.com/
 * Email id - hello@techpassmaster.com
 */



//  it is promise to the compiler that value will be init in future
//	Using lateinit with variables allow you to avoid Null values and thus Null Pointer Exception
// 	lateinit used only with mutable data type [var]
// 	lateinit used only with non-nullable(?) data type

fun main()
{
     val name= Country()

     name.setValue()
}

class Country
{
     lateinit var name :String  //  it is promise to the compiler that value will be init in future

     fun setValue()
     {
         name="INDIA"
         println("My country name is $name")

         name="America"
         println("My country name is $name")
     }


}