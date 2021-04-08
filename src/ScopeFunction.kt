/**
 * Created by Techpass Master on 8-April-21.
 * Website - https://techpassmaster.com/
 * Email id - hello@techpassmaster.com
 */


//Scoped Functions - Utility Functions
// There are 4 type of Scope/utility Functions
//  1-  apply
//  2-  let
//  3-  with
//  4-  run


fun main() {

//    val emp: Employee? =null      //Second use of let

    val emp = Employee()

    emp.age = 14
    emp.name = "nknkn"

//    println(emp.name)
//    println(emp.age)


//    apply Fun
    emp.apply {
        name = "jjj"
        age = 99
    }
    println(emp)


//    let fun
    emp.let {
        println(it.name)
        println(it.age)
    }

//    Second use of let
//    emp?.let {
//        println(it.name)
//        println(it.age)
//    }


//    with fun
    with(emp)
    {

        name = "sds"
        age = 55

    }


//    run fun
//    run is combination of let or with
    emp.run {
        name = "uuu"
        age = 67
    }
}


data class Employee(var name: String = "", var age: Int = 25)