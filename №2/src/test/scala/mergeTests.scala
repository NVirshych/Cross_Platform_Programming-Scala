import merge.Student
import org.scalatest.flatspec.AnyFlatSpec

class mergeTests extends AnyFlatSpec{

  "merge" should "return empty List if args are empty Lists" in {
    assert(merge.merge(List(), List()) === List())
  }

  it should "merge Lists keeping order and updating numeration" in{
    assert(merge.merge(List(Student(1, "A"), Student(2, "C")), List(Student(1, "B"))) === List(Student(1, "A"), Student(2, "B"), Student(3, "C")))
  }

}
