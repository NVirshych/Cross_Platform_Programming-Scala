import org.scalatest.flatspec.AnyFlatSpec

class duplicateTests extends AnyFlatSpec{

  "duplicate" should "return empty List if arg is empty List" in {
    assert(duplicate.duplicate(List()) === List())
  }

  it should "duplicate values of any type" in {
    assert(duplicate.duplicate(List(1, 2)) === List(1, 1, 2, 2))
    assert(duplicate.duplicate(List("1", "2")) === List("1", "1", "2", "2"))
    assert(duplicate.duplicate(List(true, false)) === List(true, true, false, false))
  }
}