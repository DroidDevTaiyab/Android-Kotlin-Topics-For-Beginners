/**
 * Created by Techpass Master on 8-April-21.
 * Website - https://techpassmaster.com/
 * Email id - hello@techpassmaster.com
 */

fun main() {

    val p1=PostDetails("1","Marvel"
        ,"The Marvel Cinematic Universe is an American media franchise shared published")

    println(p1)

    println(SERVER_URL)
    fileFun()
}


data class PostDetails(var id : String, var name: String, var description: String)
