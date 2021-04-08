/**
 * Created by Techpass Master on 8-April-21.
 * Website - https://techpassmaster.com/
 * Email id - hello@techpassmaster.com
 */


//  Singleton   - Restrict a class to have only one object
//      object is already singleton because behind the seen kotlin create the class for the object
//      and Restrict a class to have only one object.
//      object is already singleton in kotlin, because can the only create one object
//      All member is private in singleton

fun main() {

    //      we are going to check social media like on our website with singleton object .

    SharingWidget.incrementFbLikes()
    SharingWidget.incrementFbLikes()
    SharingWidget.incrementFbLikes()
    SharingWidget.incrementInstaLikes()
    SharingWidget.incrementInstaLikes()
    SharingWidget.incrementTwitterLikes()
    SharingWidget.incrementTiktokLikes()
    SharingWidget.display()

}

object SharingWidget{

    // make private otherwise, anyone can change it
    private var fbLikes=0
    private var insttaLike=0
    private var twitterLike=0
    private var tiktokLike=0


    fun incrementFbLikes()
    {
        fbLikes++
    }
    fun incrementInstaLikes()
    {
        insttaLike++
    }
    fun incrementTwitterLikes()
    {
            // No likes yet
    }
    fun incrementTiktokLikes()
    {
        tiktokLike++
    }

    fun display()
    {
        println(fbLikes)
        println(insttaLike)
        println(twitterLike)
        println(tiktokLike)
    }

}