import java.io.{PrintWriter, File}

def twice(op: Double => Double, x: Double) = op(op(x))

twice(_ + 1, 5)

def withPrintWriter(file: File, op: PrintWriter => Unit): Unit = {
  val writer = new PrintWriter(file)
  try {
    op(writer)
  } finally {
    writer.close
  }
}

withPrintWriter(
  new File("data.txt"),
  writer => writer.println(new java.util.Date)
)

def withPrintWriter2(file: File)(op: PrintWriter => Unit) {
  val writer = new PrintWriter(file)
  try {
    op(writer)
  } finally {
    writer.close
  }
}
val file = new File("date.txt")
withPrintWriter2(file) { writer => writer.println(new java.util.Date) }
