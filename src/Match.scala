import java.util.Locale

object Match {
  def main(args: Array[String]): Unit = {
    val taro = "Taro"

    taro match {
        case "Taro" => println("Male")
        case "Jiro" => println("Male")
        case "Hanako" => println("Female")
    }
    
    val lst1 = List("A", "B", "C")

    lst1 match {
    case List("A", b, c) =>
        println("b = " + b)
        println("c = " + c)
    case _ =>
        println("nothing")
    }

    val lst2 = List(List("A"), List("B", "C"))

    lst2 match {
    case List(a@List("A"), x) =>
        println(a)
        println(x)
    case _ => 
        println("nothing")
    }

    val obj: AnyRef = "String Literal"

    obj match {
    case v:java.lang.Integer =>
        println("Integer!")
    case v:String =>
        println(v.toUpperCase(Locale.ENGLISH))
    }
  }
}
