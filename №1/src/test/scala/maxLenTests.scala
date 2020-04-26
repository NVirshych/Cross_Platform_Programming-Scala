import org.scalatest.flatspec.AnyFlatSpec

class maxLenTests extends AnyFlatSpec{

    "maxLen" should "print max len" in {
      val list = List("First", "Second", "Third")
      assert(maxLen.maxLen(list, 0) === 6)
    }

    it should "throw IndexOutOfBoundsException if list is empty" in {
      val list = List[String]()
      assertThrows[IndexOutOfBoundsException]{
        maxLen.maxLen(list, 0)
      }
    }

    "maxLenTR" should "print max len" in {
      val list = List("First", "Second", "Third")
      assert(maxLen.maxLenTR(list, 0, 0) === 6)
    }

    it should "throw IndexOutOfBoundsException if list is empty" in {
      val list = List[String]()
      assertThrows[IndexOutOfBoundsException]{
        maxLen.maxLenTR(list, 0, 0)
      }
    }
}