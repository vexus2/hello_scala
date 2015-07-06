//abstract class Element {
//  def contents: Array[String]
//
//  def height: Int = contents.length
//
//  def width: Int = if (height == 0) 0 else contents(0).length
//}
//
//class ArrayElement(val contents: Array[String]) extends Element
//
//class LineElement(s: String) extends ArrayElement(Array(s)) {
//  override def width = s.length
//
//  override def height = 1
//}
//
//
//class UniformElement(
//                      ch: Char,
//                      override val width: Int,
//                      override val height: Int
//                      ) extends Element {
//  private val line = ch.toString * width
//
//  def contents = Array.fill(height)(line)
//}
//
//val e1: Element = new ArrayElement(Array("hello", "world"))
//val ae: ArrayElement = new LineElement("hello")
//val e2: Element = ae
//val e3: Element = new UniformElement('x', 2, 3)
//

abstract class Element {
  def demo(): Unit = {
    println ("Element's implementation ivnoked")
  }
}

class ArrayElement extends Element {
  override def demo(): Unit = {
    println("Array Element's implementation invoked")
  }
}

class LineElement extends ArrayElement {
  override def demo(): Unit = {
    println("LineElement's implementation invoked")
  }
}

// UniformElementはElementのdemoを継承する
class UniformElement extends Element

def invokeDemo(e: Element): Unit = {
  e.demo()
}
invokeDemo(new ArrayElement)
invokeDemo(new LineElement)
invokeDemo(new UniformElement)

