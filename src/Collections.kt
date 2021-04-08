/**
 * Created by Techpass Master on 8-April-21.
 * Website - https://techpassmaster.com/
 * Email id - hello@techpassmaster.com
 */


//  Collection > Mutable and Immutable

            //  Mutable list (Read, Write)
//  1- Mutable list -   ArrayList, arrayListOf, mutableListOf
//  2- Mutable Map  -   HasMap, HasMapOf, mutableMapOf
//  3- Mutable Set  -   hashSetOf, mutableSetOf

            //  Immutable list (Read only)
//  1- Immutable list -   listOf
//  2- Immutable Map  -   mapOf
//  3- Immutable Set  -   setOf


fun main() {

//    //              ListOf
//
//    var list = listOf<String>("Taiyab", "Sahil")      // (immutable, Fixed Size, Read Only)
//
////    list[0]="Arif"                                  // can't replace because it's immutable
//
//    list.forEach { myElement -> println(myElement) }



//                 Mutable List Of

//    val student= mutableListOf<Int>(1,2,3,4,5)    // Mutable list- it can be change element (remove, add, replace)
//    val student1= arrayListOf<Int>(1,2,3,4,5)     // Mutable list- it can be change element (remove, add, replace)
//    val student2= ArrayList<String>()             // Mutable list- it can be change element (remove, add, replace)
//    student2.add("Laptop")
//    student2.add("Mouse")
//    student2.add("Keyboard")

//    student[0]=5
//    println(student.indexOf(1))
//    println(student.contains(4))
//    student2.forEach { println(it) }                  // Print all element in the list

//    val student3= mutableListOf<Int>(6,7,8,9,10)
//    student.addAll(student3)                          // add list
//    println(student)


//                Mutable MAP   (KEY, VALUE) ex-(1,"Taiyab")

//    val teacher = mutableMapOf<Int, String>()    // (Mutable MAP, NO Fixed Size, Read and Write)
//    teacher.put(1, "Taiyab")
//    teacher.put(2, "Sahil")
//    teacher.put(3, "Arif")
//
//    println(teacher)
//    teacher.replace(1, "Ali")            // Replace value by key
//    println(teacher.get(1))             // get value in the list by key
//
////     print all value by forEach loop
//
//    teacher.forEach { myKey, myValue -> println("${myKey} = ${myValue}") }

//     print all value by for loop

//    for ((myKey, myValue) in teacher) {
//        println("${myKey} = ${myValue}")
//  }


// //                 MAP OF   (KEY, VALUE) ex-(44,"Sahil")   (immutable MAP, Fixed Size, Read Only)

//    val teacher2 = mapOf<Int, String>(11 to "Website",44 to "Hello")
//      teacher2.put(1, "Taiyab")              // Can't be add value
//      teacher2.replace(1, "Ali")            // Can't be replace value
//      println(teacher2.get(11))             // get value in the list by key

// //     print all value by forEach loop
// //     teacher2.forEach { myKey, myValue -> println("${myKey} = ${myValue}") }
//      teacher2.forEach { println(it) }



//                              Set Of
//      Set* contain unique element(ex-  no duplicate element print, its remove auto.)

//    val mySet= listOf<Int>(4,5,8,6,1,3,3,3,9)     // (immutable, Fixed Size, Read Only)
//    mySet.forEach { (println(it)) }


//                          mutableSetOf        // (Mutable, No Fixed Size, Read & Write, All sequence)
//           mutableSetOf* also contain unique element

//    val mySet= mutableSetOf<Int>(4,5,8,6,1,3,3,3,9)
//    mySet.add(11)
//    mySet.remove(4)
//    mySet.forEach { (println(it)) }


//    //                          HashSet             // (Mutable, No Fixed Size, Read & Write, No sequence)
//    //    HashSet* also contain unique element but element sequence is not guaranteed
//
//    val mySet= hashSetOf<Int>(4,5,8,6,1,3,3,3,9)
//    mySet.add(11)
//    mySet.remove(4)
//    mySet.forEach { (println(it)) }



//                          Array

//    var array = Array(5) { 0 }
//
//    array[0] = 786
//    array[1] = 666
//    array[4] = 333
//    array[5]=555              array outOfIndex

//    array.forEach { myElement -> println(myElement) }
}
