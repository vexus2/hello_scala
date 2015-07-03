import scala.util.control.Breaks._
import java.io.{InputStreamReader, BufferedReader}

// かなり雑だがJavaだとこう
//int i=0;
//boolean foundIt=false;
//while(i<args.length){
//  if(args[i].startWith("-")){
//    i=i+1;
//    continue;
//  }
//
//  if(args[i].endWith(".scala")){
//    foundIt=true;
//    break;
//  }
//  i=i+1
//}

val args = Array("1.scala", "2.scala", "3.java", "-4.scala")

// breakやcontinueを使わないループ
var i = 0
var foundIt = false
while (i < args.length && !foundIt) {
  if (!args(i).startsWith("-")) {
    if (args(i).endsWith(".scala"))
      foundIt = true
  }
  i = i + 1
}

// 再帰を使ったコード
def searchForm(i: Int): Int =
  if (i >= args.length) -1
  else if (args(i).startsWith("-")) searchForm(i + 1)
  else if (args(i).endsWith(".scala")) i
  else searchForm(i + 1)

val j = searchForm(0)

val in = new BufferedReader(new InputStreamReader(System.in))


breakable {
  while (true) {
    println("? ")
    if (in.readLine() == "") break
  }
}
