object Trait {
  def main(args: Array[String]){
    val classA = new ClassA
    classA.greet()
    val classB = new ClassB
    classB.greet()
  }
}

trait TraitA {
  def greet(): Unit = println("Hello!")
}

trait TraitB extends TraitA {
  override def greet(): Unit = {
    super.greet()
    println("My name is Terebi-chan.")
  }
}

trait TraitC extends TraitA {
  override def greet(): Unit = {
    super.greet()
    println("I like niconico.")
  }
}

class ClassA extends TraitB with TraitC
class ClassB extends TraitC with TraitB
