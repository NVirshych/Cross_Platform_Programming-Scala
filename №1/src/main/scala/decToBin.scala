//4. Перевести число из десятичной в двоичную сс
import scala.annotation.tailrec
import scala.io.StdIn

object decToBin {

  //Рекурсивная функция
  def decToBin(num : Int) : String = {
    if(num < 2)
      num.toString
    else
      decToBin(num / 2) + (num % 2).toString
  }

  //Функция с хвостовой рекурсией
  @tailrec
  def decToBinTR(num : Int, str : String) : String = {
    if(num < 2)
      num.toString + str
    else
      decToBinTR(num / 2, (num % 2).toString + str)
  }

  def main(args : Array[String]) : Unit = {
    println("Input positive num to convert")
    val num = StdIn.readInt().abs

    println("\nRecursive : \n" + num + " dec = " + decToBin(num) + " bin")
    println("\nTail recursive : \n" + num + " dec = " + decToBinTR(num, "") + " bin")
  }
}