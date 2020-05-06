//4.	На основе Map[String,Int] сгенерировать список, состоящий из тех ключей Map, значения которых являются четными.

object getKeysEven {

  def isEven( value : Int) : Boolean = {
    value % 2 == 0
  }

  def getKeysEven[A](base : Map[A, Int]) : List[A] = {
    base.filter(value => isEven(value._2)).keySet.toList
  }

  def main(args : Array[String]) : Unit = {

      val baseMap = Map( "First" -> 1, "Second" -> 2, "Third" -> 3, "Fourth" -> 4 )
      println(getKeysEven(baseMap))
  }
}
