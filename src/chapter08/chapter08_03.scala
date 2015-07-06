var increase = (x: Int) => x + 1

increase(10)

increase = (x: Int) => x + 9999

increase(1)

increase = (x: Int) => {
  println("We")
  println("are")
  println("here")
  x + 1
}
increase(10)
val someNumbers = List(-11, -10, -5, 0, 5, 10)
someNumbers.foreach((x: Int) => println(x))

someNumbers.filter((x: Int) => x > 0)
someNumbers.filterNot((x: Int) => x > 0)

