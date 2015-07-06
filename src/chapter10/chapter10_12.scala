abstract class Element {
  def contents: Array[String]

  def height: Int = contents.length

  def width: Int = if (height == 0) 0 else contents(0).length

  def avobe(that: Element): Element = new ArrayElement(this.contents ++ that.contents)

  def beside(that: Element): Element = {
    //    val contents = new Array[String](this.contents.length)
    //    for(i <- 0 until this.contents.length)
    //      contents(i) = this.contents(i) + that.contents(i)
    //    new ArrayElement(contents)
    // 上記と等価
    new ArrayElement(
      for ((line1, line2) <- this.contents zip that.contents) yield line1 + line2
    )
  }

  override def toString = contents mkString "\n"
}

class ArrayElement(val contents: Array[String]) extends Element

class LineElement(s: String) extends Element {
  val contents = Array(s)

  override def width = s.length

  override def height = 1
}

