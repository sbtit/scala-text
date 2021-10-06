class Adder {
  def add(x: Int, y: Int): Int = x + y
}

val adder = new Adder()
// adder: Adder = repl.MdocSession$App$Adder$2@a0b43da

adder.add(2, 3)
// res3: Int = 5

val fun: Int => Int = adder.add(2, _)
// fun: Int => Int = <function1>
fun(3)
// res4: Int = 5
