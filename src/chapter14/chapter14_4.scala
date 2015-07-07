import junit.framework.TestCase

object Element {

  private class ArrayAlement(
                              val contents: Array[String]
                              ) extends Element

  private class LineElement(s: String) extends Element {
    val contents = Array(s)

    override def width = s.length

    override def height = 1
  }

  private class UniformElement(
                                ch: Char,
                                override val width: Int,
                                override val height: Int
                                ) extends Element {
    private val line = ch.toString * width

    def contents = Array.fill(height)(line)
  }

  def elem(contents: Array[String]): Element = new ArrayElement(contents)

  def elem(chr: Char, width: Int, height: Int): Element = new UniformElement(chr, width, height)

  def elem(line: String): Element = new LineElement(line)
}
class ElementTestCase extends TestCase {
  def testUniformElement(): Unit = {
    val ele = elem('x', 2, 3)
  }

}
