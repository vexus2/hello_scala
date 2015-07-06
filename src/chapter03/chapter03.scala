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


// 命令形の記述
def printArgs(args: Array[String]): Unit = {
  var i = 0
  while (i < args.length) {
    println(args(i))
    i += 1
  }
}

// varを取り除く
def printArgs2(args: Array[String]): Unit = {
  for (arg <- args) println(arg)
}

def printArgs3(args: Array[String]): Unit = {
  args.foreach(println)
}

// 副作用もvarもない関数
def formatArgs(args: Array[String]) = args.mkString("\n")
println(formatArgs(args))

import scala.io.Source

def widthOfLength(s:String) = s.length.toString.length

if (args.length > 0) {
  val lines = Source.fromFile(args(0)).getLines().toList
  val longestLines = lines.reduceLeft(
    (a, b) => if (a.length > b.length) a else b
  )
  val maxWidth = widthOfLength(longestLines)
  for(line <- lines) {
    val numSpaces = maxWidth - widthOfLength(line)
    val padding = " " * numSpaces
    println(padding + line.length + " | " + line)
  }
}else
  Console.err.println("Please enter filename")


