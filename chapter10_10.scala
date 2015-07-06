abstract class Element {
  def contents: Array[String]

  def height: Int = contents.length

  def width: Int = if (height == 0) 0 else contents(0).length
}

final class ArrayElement extends Element {
  def demo(): Unit = {
    println("ArrayElement's implementation invoked")
  }
}
