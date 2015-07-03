import java.io.{IOException, FileNotFoundException, FileReader}
import java.net.{MalformedURLException, URL}

try {
  val f = new FileReader("imput.txt")
} catch {
  case ex: FileNotFoundException => println(ex)
  case ex: IOException => println(ex)
} finally {
}

def urlFor(path: String) =
  try {
    new URL(path)
  }catch {
    case e: MalformedURLException => new URL("http://scala-lang.org")
  }

