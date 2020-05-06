//4.	Коллекция представляет из себя номерной список студентов, отсортированных по алфавиту. Из двух таких списков сделать один.

object merge {

  case class Student(num : Int, name : String)

  def merge(first : List[Student], second : List[Student] ) : List[Student] = {
    //Конкатенировать исходные списки, отсортировать по именам, из полученного списка заполнить новый, обновляя нумерацию
    (first:::second).sortBy(_.name).foldLeft( List[Student]() ){ (list, stud) => list:::(Student(list.size + 1, stud.name) :: Nil) }
  }

  def main(args : Array[String]) : Unit = {

    val list1 = List( Student(1, "Aa"), Student(2, "Cc"))
    val list2 = List( Student(1, "Bb"), Student(2, "Dd"))

    println(merge(list1, list2))
  }
}