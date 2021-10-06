object ControlSyntax {
  def main(args: Array[String]): Unit = {

    { println("A"); println("B"); println(1 + 2); }
    
    var age = 17
    if(age < 18) {
        println("18歳未満です")
    } else {
        println("18歳以上です")
    }
    var age: Int = 5
    var isSchoolStarted: Boolean = false
    if(1 <= age && age <= 6 && !isSchoolStarted) {
        println("幼児です")
    } else {
        println("幼児ではありません")
    }

    var i = 1

    while(i <= 10) {
        println("i = " + i)
        i = i + 1
    }

    for(x <- 1 to 5; y <- 1 until 5){
        println("x = " + x + " y = " + y)
    }
    for(e <- List("A", "B", "C", "D", "E")) yield {
        "Pre" + e
    }
  }
}
