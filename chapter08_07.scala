val someNumbers = List(-11, -10, -5, 0, 5, 10)

// 下記と等価
// someNumbers.foreach(x => println(x))
someNumbers.foreach(println _)
def sum(a: Int, b: Int, c: Int) = a + b + c
sum(1,2,3)
val a = sum _
val result = a(1,2,3)
val b = sum(1, _: Int, 3)
b(2)
b(5)

//val c = sum

val d = sum _
d(10, 20, 30)
