abstract class Element {
  def contents: Array[String]

  def height: Int = contents.length

  def width: Int = if (height == 0) 0 else contents(0).length
}

class ArrayElement(conts: Array[String]) extends Element {
  override def contents: Array[String] = conts
}

val ae = new ArrayElement(Array("hello", "world"))

ae.width

