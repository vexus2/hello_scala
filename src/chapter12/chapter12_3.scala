class Point(val x: Int, val y: Int)

//class Rectangle(val topLeft: Point, val bottomRight: Point) {
//  def left = topLeft.x
//
//  def right = bottomRight.x
//
//  def width = right - left
//  // more methods
//}

//abstract class Component {
//  def topLeft: Point
//
//  def bottomRight: Point
//
//  def left = topLeft.x
//
//  def right = bottomRight.x
//
//  def width = right - left
//  // more methods
//}

trait Rectangular {
  def topLeft: Point
  def bottomRight: Point
  def left = topLeft.x
  def right = bottomRight.x
  def width = right - left
  // more methods
}

abstract class Component extends Rectangular {
  // other methods
}

class Rectangle(val topLeft: Point, val bottomRight: Point) extends Rectangular {
  // other methods
}

val rect = new Rectangle(new Point(1, 1), new Point(10, 10))
rect.width

