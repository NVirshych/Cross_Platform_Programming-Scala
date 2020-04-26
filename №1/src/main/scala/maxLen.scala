//4. Найти длину самого большого слова в списке.
import scala.annotation.tailrec
import scala.io.Source

object maxLen {

  def max(a : Int, b : Int ) : Int = {
    if(a > b) a else b
  }

  //Рекурсивная функция
  def maxLen(words : List[String], index : Int) : Int = {
    if(words.length == index + 1)
      words(index).length
    else
      max(words(index).length, maxLen(words, index+1))
  }

  //Функция с хвостовой рекурсией
  @tailrec
  def maxLenTR(words : List[String], index : Int, curMax : Int) : Int = {
    if(words.length == index + 1)
      max(words(index).length, curMax)
    else
      maxLenTR(words, index + 1, max(words(index).length, curMax))
  }


  def main(args : Array[String]) : Unit ={

    val file : Source = Source.fromFile("C:\\Users\\Никита\\Desktop\\КПП\\untitled\\src\\main\\scala\\data.txt")  //Файл с данными
    val list : List[String] = file.getLines().toList

    println("\nRecursive : Length of the longest word from file is " + maxLen(list, 0))

    println("\nTail recursive : Length of the longest word from file is " + maxLenTR(list, 0, 0))

    file.close()
  }
}
