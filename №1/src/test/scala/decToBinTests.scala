import org.scalatest.flatspec.AnyFlatSpec

class decToBinTests extends AnyFlatSpec{

  "decToBin" should "return binary representation of a decimal" in{

    assert(decToBin.decToBin(13) === "1101")

  }

  "decToBinTR" should "return binary representation of a decimal" in{

    assert(decToBin.decToBinTR(13, "") === "1101")

  }
}