// 連続パラメータ
def echo(args: String*) = for (arg <- args) println(arg)
//下記も等価
//def echo(args: String*) = args.foreach(println)

echo()

echo("one")
echo("hello", "world")
val arr = Array("What's", "up", "doc?")
echo(arr: _*)

// 名前付き引数
def speed(distance: Float, time: Float): Float = distance / time

speed(100, 10)
speed(distance = 100, time = 10)
speed(time = 10, distance = 100)


def printTime(out: java.io.PrintStream = Console.out) = out.println("time = " + System.currentTimeMillis())
def printTime2(out: java.io.PrintStream = Console.out, divisor: Int = 1) = out.println("time = " + System.currentTimeMillis() / divisor)
printTime2(out = Console.err)
printTime2(divisor = 100)
