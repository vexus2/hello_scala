println("Hello, world, from script!")
println("Hello, " + args(0) + "!")

var i = 0
while (i < args.length) {
  if (i != 0)
    print(" ")
  print(args(i))
  i += 1
}
println()


// 下記の3つは同じ
args.foreach(arg => println(arg))
args.foreach((arg: String) => println(arg))
args.foreach(println)

for(arg <- args) println(arg)