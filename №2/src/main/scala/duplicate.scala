//4.	Реализовать функцию, которая принимает список и возвращает новый список с дублированными элементами первоначального.

object duplicate {

  def duplicate[A](base : List[A]) : List[A] = {
    base.foldLeft(List[A]()) { (list, value) => list ::: (value :: value :: Nil) }
  }

  def main(args : Array[String]) : Unit = {

    val baseList = List(true, false)
    println(duplicate(baseList))
  }
}