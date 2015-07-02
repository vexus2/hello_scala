class Rational(n: Int, d: Int) {
  require(d != 0)
  private val g = gcd(n.abs, d.abs)
  val number: Int = n / g
  val denom: Int = d / g

  def this(n: Int) = this(n, 1) // 補助コンストラクタ

  override def toString = number + "/" + denom

  def +(that: Rational): Rational = new Rational(n * that.denom + that.number * d, d * that.denom)

  def +(i: Int): Rational = new Rational(number + i * denom, denom)

  def -(that: Rational): Rational = new Rational(number * that.denom - that.number * denom, denom * that.denom)

  def -(i: Int): Rational = new Rational(number - i * denom, denom)

  def *(that: Rational): Rational = new Rational(number * that.number, denom * that.denom)

  def *(i: Int): Rational = new Rational(number * i, denom)

  def /(that: Rational): Rational = new Rational(number * that.denom, denom * that.number)

  def /(i: Int): Rational = new Rational(number, denom * i)

  def lessThan(that: Rational): Boolean = this.number * that.denom < that.number * this.denom

  def max(that: Rational): Rational = if (this.lessThan(that)) that else this

  private def gcd(a: Int, b: Int): Int = if (b == 0) a else gcd(b, a % b)
}

val x = new Rational(1, 2)
val y = new Rational(2, 3)
val oneHalf = new Rational(1, 2)
val twoThirds = new Rational(2, 3)
oneHalf + twoThirds
oneHalf.number
new Rational(3)
new Rational(66, 42)

x + x * y

(x + x) * y

x + (x * y)


y * y
y * 2

implicit def intToRational(x: Int): Rational = new Rational(x)
