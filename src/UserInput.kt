/**
 * Created by Techpass Master on 8-April-21.
 * Website - https://techpassmaster.com/
 * Email id - hello@techpassmaster.com
 */

fun main() {

    var userInput = UserInput.AddTwoNum()
    var userInput2 = UserInput.SubTwoNum()

    println("Enter two Number for Plus")
    takeUserInput(userInput)

    println("Enter two Number for Minus")
    takeUserInput(userInput2)


//    userInput.takeUserInput()
}


sealed class UserInput {

    class AddTwoNum : UserInput()
    class SubTwoNum : UserInput()


}

fun takeUserInput(calc: UserInput) {
    var num1 = readLine()
    var num2 = readLine()

    when (calc) {

        is UserInput.AddTwoNum -> println(num1?.toInt()?.plus(num2?.toInt()!!))
        is UserInput.SubTwoNum -> println(num1?.toInt()?.minus(num2?.toInt()!!))

    }
}