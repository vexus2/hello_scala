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
