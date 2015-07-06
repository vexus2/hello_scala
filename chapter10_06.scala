abstract class Element {
  def contents: Array[String]

  def height: Int = contents.length

  def width: Int = if (height == 0) 0 else contents(0).length
}

class ArrayElement(val contents: Array[String]) extends Element

// 上記と等価
class ArrayElement1(x123: Array[String]) extends Element {
  val contents: Array[String] = x123
}

class Cat {
  val dangerous = false
}

class Tiger(
             override val dangerous: Boolean,
             private var age: Int
             ) extends Cat

// 上記と等価
class Tiger2(param1: Boolean, param2: Int) extends Cat {
  override val dangerous = param1
  private val age = param2
}

