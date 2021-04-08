/**
 * Created by Techpass Master on 8-April-21.
 * Website - https://techpassmaster.com/
 * Email id - hello@techpassmaster.com
 */

//     it is the shorter version of if/else & replace with switch
//     its use for code readability

fun main() {

    val animal = "Dog"

//     if(animal=="Horse")
//     {
//         println("Animal is Horse")
//     }

//     else if(animal=="Cat")
//     {
//         println("Animal is Cat")
//     }
//     else if(animal=="Dog")
//     {
//         println("Animal is Dog")
//     }

//     else
//     {
//         println("Animal is Not Found")
//     }



//     when is the shorter version of if/else & replace with switch
//     when use for code readability
    when(animal)
    {
        "Horse"-> println("Animal is Horse")
        "Cat"-> println("Animal is Cat")
        "Dog"-> println("Animal is Dog")
        else -> "Animal is not Found"
    }

}
