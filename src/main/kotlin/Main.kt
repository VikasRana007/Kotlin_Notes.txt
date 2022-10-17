


fun main() {
//  val myListOfNames = listOf("Vikas", "Pooja", "Avyukt", "Kanta", "Rohtash")
//  val myMutableList = mutableListOf("Vikas", "Pooja", "Avyukt", "Kanta", "Rohtash")
//
//  myMutableList.add(2,"Harry")
//  myMutableList.add(3,"Lakshay")
//  myMutableList.removeAt(4)
//  myMutableList.remove("Harry")
//    println(myListOfNames)

//  for (mutableItem in myMutableList){
//    println(mutableItem)
//  }
//println("My Mutable List Size is ${myMutableList.size}")
//println("My Mutable List Second Element is ${myMutableList[1]}")
//println("Index of Element \"Lakshay\" ${myMutableList.indexOf("Lakshay")}")

//  myMutableList.forEach { println(it) }
//  myListOfNames.forEach { println(it) }


//  for(item in myListOfNames){
//    println("All Persons Name : $item")
//  }

//  val myNewList = mutableListOf<String>()
//  myNewList.add("new Name")
//  myNewList.add("old Name")
//  myNewList.add("avg Name")

//  for (i in 1..10){
//    myNewList.add(i,"Hello Dude : $i")
//  }
//  for(i in myNewList){
//    println(i)
//  }

//  println(myNewList)

//  val myNewimList = listOf<Int>(1,2,3,4)     // add items in the mutable list here
//
//  val emptyList = emptyList<String>()
//  val emptySet = emptySet<String>()
//  val emptyMap = emptyMap<String,Int>()


//  myNewList.forEach { println(it) }

  // Set
//  val mySet = setOf(1, 2, 3, 4)
//  val myMutableSet = mutableSetOf("US","MZ", "AU")
//  myMutableSet.add("IN")
//
//  println("Mutable Set Values are : $myMutableSet")


  // map

//  val map = mapOf("Up" to 1,"Down" to 2, "Left" to 3, "Right" to 4)
//  val secretMap = mapOf("Up" to 1,"Down" to 2, "Left" to 3, "Right" to 4)
//  val myMutableSecretMap = mutableMapOf("one" to 1, "two" to 2, "Three" to 3)
//  myMutableSecretMap["four"] = 4
//  println(secretMap.keys)
//  println(secretMap.values)
//  if("Up" in secretMap)
//  {
//    println("Yes is in")
//  }
  // filter

//  val myListOfNames = listOf<String>("abcd", "ABCD",  "tannu", "mannu", "wedds")
  val myListOfNames = listOf<Int>(1,2,3,4)
 print(myListOfNames.sumOf { it * 3 })    // that is called  Creation, Change, Conclude


//  val found = myListOfNames.filter { it == "mannu" }
//  val found = myListOfNames.filter { it.startsWith("a",ignoreCase = true) }
//  val found = myListOfNames.filter { it.endsWith("u") && it.startsWith('M', ignoreCase = true) }
//   filter can also apply with startWith, endsWith, with any alphabet

//  println(myListOfNames)

}