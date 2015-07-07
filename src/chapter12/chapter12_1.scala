class Frog1 extends Philosophical {
  override def toString = "green"
}

trait Philosophical {
  def philosophize(): Unit = {
    println("I consume memory, therefore I am!")
  }
}

val frog = new Frog1
frog.philosophize()
val phil: Philosophical = frog
phil.philosophize()
class Animal
class Frog2 extends Animal with Philosophical {
  override def toString = "green"
}

trait HasLegs
class Frog3 extends Animal with Philosophical with HasLegs {
  override def toString = "green"
  override def philosophize(): Unit = {
    println("It ain't easy being " + toString + "!")
  }
}

new Frog3().philosophize()