import org.scalatest.flatspec.AnyFlatSpec

class getKeysEvenTests extends AnyFlatSpec{

  "isEven" should "return true for even numbers" in {
    assert(getKeysEven.isEven(0) === true)
    assert(getKeysEven.isEven(-148) === true)
  }

  it should "return false for odd numbers" in {
    assert(getKeysEven.isEven(1) === false)
    assert(getKeysEven.isEven(-135) === false)
  }

  "getKeysEven" should "return empty List if arg is empty Map" in {
    assert(getKeysEven.getKeysEven(Map()) === List())
  }

  it should "return List of keys of even elements" in {
    assert(getKeysEven.getKeysEven(Map( 1 -> 1, 2 -> 2, 3 -> 5, 0 -> 0)) === List(2, 0))
    assert(getKeysEven.getKeysEven(Map( "One" -> 1, "Two" -> 2, "Three" -> 5, "Zero" -> 0)) === List("Two", "Zero"))
  }
}