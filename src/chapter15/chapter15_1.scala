// ケースクラスの動き
abstract class Expr

case class Var(name: String) extends Expr

case class Number(num: Double) extends Expr

case class UnOp(operator: String, arg: Expr) extends Expr

case class BinOp(operator: String, left: Expr, right: Expr) extends Expr


val v = Var("x")
val op = BinOp("+", Number(1), v)

v.name

op.left

println(op)

op.right == Var("x")

op.copy(operator = "-")

// ケースクラスの実用例( パターンマッチ )
val e = Number(3)
//UnOp("-", UnOp("-", e)) => e
//BinOp("+", e, Number(0)) => e
//BinOp("*", e, Number(1)) => e

def simplifyTop(expr: Expr): Expr = expr match {
  case UnOp("-", UnOp("-", e)) => e
  case BinOp("+", Number(0)) => e
  case BinOp("*", Number(1)) => e
  case _ => expr
}