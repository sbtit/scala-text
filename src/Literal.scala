object Literal {
  def main(args: Array[String]): Unit = {
    val v = List(0xff,1e308,9223372036854775807L,
                922337203685477580.7,1.00000000000000000001,
                "\u3042","\ud842\udf9f")
    for(e <- v){
        println(e)
    } 
  }
}
