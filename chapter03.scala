import java.math.BigInteger

val big = new BigInteger("12345")

val greetStrings = new Array[String](3)
greetStrings(0) = "Hello"
greetStrings(1) = ", "
greetStrings(2) = "world!\n"

// 以下の2つは等価
for (i <- 0 to 2) print(greetStrings(i))
for (i <- 0 to 2) print(greetStrings.apply(i))

// 以下の2つは等価
greetStrings(0) = "Hello"
greetStrings.update(0, "Hello")

val numNames = Array("zero", "one", "two")
val numNames2 = Array.apply("zero", "one", "two")

val oneTwoThree = List(1, 2, 3)
val oneTwo = List(1, 2)
val threeFour = List(3, 4)
val oneTwoThreeFour = oneTwo ::: threeFour
println(oneTwo + " and " + threeFour + " were not mutated.")
println("Thus, " + oneTwoThreeFour + " is a new list.")

val twoThree2 = List(2, 3)
val oneTwoThree2 = 1 :: twoThree2
println(oneTwoThree2)

val oneTwoThree3 = 1 :: 2 :: 3 :: Nil
println(oneTwoThree3)
oneTwoThree3.foreach(s => println(s))

val pair = (99, "Luftballoons")
println(pair._1)
println(pair._2)

var jetSet = Set("Boeing", "Airbus")
jetSet += "Lear"
println(jetSet.contains("Cessna"))

val movieSet = scala.collection.mutable.Set("Hitch", "Poltergeist")
movieSet += "Shark"
println(movieSet)

val hashSet = scala.collection.immutable.HashSet("Tomatoes", "Chilies")
println(hashSet + "Coriander")

val treasureMap = scala.collection.mutable.Map[Int, String]()

treasureMap += (1 -> "Go to island.")
treasureMap += (2 -> "Find big on ground.")
treasureMap += (3 -> "Dig.")
println(treasureMap(2))

val romanNumeral = Map(
1 -> "I", 2 -> "II", 3 -> "III", 4 -> "IV", 5 -> "V"
)

println(romanNumeral(4))
