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
    val file = Source.fromFile("C:\\Users\\Никита\\Desktop\\КПП\\untitled\\src\\main\\scala\\data.txt")  //Файл с данными
    val list = file.getLines().toList

    println("\n" + list + "\n")
    println("Recursive : Length of the longest word is " + maxLen(list, 0))
    println("Tail recursive : Length of the longest word is " + maxLenTR(list, 0, 0))

    file.close()
  }
}